package com.sun3d.why.controller;

import com.sun3d.why.proconfig.MyProSettings;
import com.sun3d.why.proconfig.MyProSettingsOut;
import com.sun3d.why1.service.BootXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@Controller
public class HelloController {

    @Value("${application.hello:Hello Angel}")
    private String hello;
    @Autowired
    private MyProSettings myProSettings;
    @Autowired
    private MyProSettingsOut myProSettingsOut;
    @Autowired
    private BootXMLService bootXMLService;

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello="+hello);
        map.put("hello",hello);
        return "/hello";
    }
    @RequestMapping("/hello1")
    @ResponseBody
    public String hello1(Map<String,Object> map){
        System.out.println(myProSettings.getName());
        System.out.println(myProSettings.getGender());
        System.out.println(myProSettingsOut.getName());
        System.out.println(myProSettingsOut.getGender());
        return "ok";
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        bootXMLService.sayHello();
        return "ok";
    }
}
