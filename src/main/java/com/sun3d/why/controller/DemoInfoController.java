package com.sun3d.why.controller;

import com.sun3d.why.model.DemoInfo;
import com.sun3d.why.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiech on 2018/2/5 0005.
 */
@Controller
public class DemoInfoController {

    @Autowired
    DemoInfoService demoInfoService;

    @RequestMapping("/test")
    public@ResponseBody String test(){
        DemoInfo loaded = demoInfoService.findById("1");
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById("1");
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById("2");
        System.out.println("loaded2="+loaded);
        return"ok";
    }

    @RequestMapping("/delete")
    public@ResponseBody String delete(String id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }
    @RequestMapping("/test1")
    public@ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }
}
