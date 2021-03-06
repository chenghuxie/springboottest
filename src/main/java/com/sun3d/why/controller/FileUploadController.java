package com.sun3d.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * Created by xiech on 2018/2/2 0002.
 */
@Controller
public class FileUploadController {
    @RequestMapping("/file")
    public String file(){
        return "/file";
    }

    @RequestMapping("/mutifile")
    public String mutifile(){
        return "/mutifile";
    }

    /**
     * 上传根路径下面
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public String handleFileUpload(@RequestParam("file")MultipartFile file){
         if(!file.isEmpty()){
             try {
                 BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                 out.write(file.getBytes());
                 out.flush();
                 out.close();
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
                 return "上传失败,"+e.getMessage();
             } catch (IOException e) {
                 e.printStackTrace();
                 return "上传失败,"+e.getMessage();
             }
             return "上传成功";
         }
         return "上传失败，应为文件是空";
    }

    /**
     * 多文件上传
     * @param request
     * @return
     */
    @RequestMapping(value="/batch/upload", method= RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(HttpServletRequest request){
        List<MultipartFile> files=((MultipartHttpServletRequest)request).getFiles("file");
        MultipartFile file=null;
        BufferedOutputStream stream=null;
        for(int i=0;i<files.size();i++){
           file=files.get(i);
           if(!file.isEmpty()){
               try {
                   byte[] bytes=file.getBytes();
                   stream=new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                   stream.write(bytes);
                   stream.close();

               } catch (IOException e) {
                   stream = null;
                   return"You failed to upload " + i + " => " + e.getMessage();
               }
           }else{
               return"You failed to upload " + i + " because the file was empty.";
           }
        }
        return"upload successful";
    }
}
