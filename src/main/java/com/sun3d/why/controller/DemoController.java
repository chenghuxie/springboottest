package com.sun3d.why.controller;

import com.sun3d.why.model.DemoBean;
import com.sun3d.why.service.DemoBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiech on 2018/1/30 0030.
 */
@RestController
@RequestMapping("/demo2")
public class DemoController {
    @Autowired
    private DemoBeanService demoBeanService;
    @RequestMapping("/getById")
    public DemoBean getById(long id){
        return   this.demoBeanService.getById(id);
    }

}
