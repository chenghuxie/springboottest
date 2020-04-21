package com.sun3d.why.controller;



import com.alibaba.fastjson.JSONObject;
import com.sun3d.why.model.DemoBean;
import com.sun3d.why.service.DemoBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiech on 2018/1/29 0029.
 */
@RestController
@RequestMapping("/demo")
public class DemoBeanController {
    @Autowired
    private DemoBeanService demoBeanService;

    @RequestMapping("/getDemoBean")
    public DemoBean getDemoBean(){
        DemoBean demoBean=new DemoBean();
        demoBean.setId("1");
        demoBean.setName("谢谢");
        return  demoBean;
    }
    @RequestMapping("/getFastjson")
    public String getFastjson(){
        DemoBean demoBean=new DemoBean();
        demoBean.setId("2");
        demoBean.setName("xiexie");
        return JSONObject.toJSONString(demoBean);
    }
  /*  @RequestMapping("/zeroException")
    public String zeroException(){
        DemoBean demoBean=null;
        return demoBean.getId();
    }*/
 /* jpa 保存数据*/
    @RequestMapping("/saveBeanBySQL")
    public void saveBeanBySQL(){
        DemoBean demoBean=new DemoBean();
        demoBean.setName("加进去了吗1");
        this.demoBeanService.saveBeanBySQL(demoBean);

    }
}
