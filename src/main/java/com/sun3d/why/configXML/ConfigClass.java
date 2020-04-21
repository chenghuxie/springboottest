package com.sun3d.why.configXML;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResouce有两种常用的引入方式：classpath和file，具体查看如下的例子：
 classpath路径：locations={"classpath:application-bean1.xml",
 "classpath:application-bean2.xml"
 }
 file路径：
 locations = {"file:d:/test/application-bean1.xml"};
 * Created by xiech on 2018/2/2 0002.
 */
@Configuration
@ImportResource(locations = {"classpath:application-bean.xml"})
public class ConfigClass {
}
