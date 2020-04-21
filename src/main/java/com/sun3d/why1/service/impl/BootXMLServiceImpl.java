package com.sun3d.why1.service.impl;

import com.sun3d.why1.service.BootXMLService;
import org.springframework.stereotype.Service;


/**
 * 该包不在App.java扫描包下
 * Created by xiech on 2018/2/2 0002.
 */
@Service
public class BootXMLServiceImpl implements BootXMLService{
   public void sayHello(){
       System.out.println("<<<<<<<BootXMLService.sayHello()>>>>>>>>>");
   }
}
