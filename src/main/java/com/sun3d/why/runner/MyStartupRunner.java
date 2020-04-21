package com.sun3d.why.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by xiech on 2018/2/1 0001.
 */
@Component
@Order(value = 1)//执行顺序 value值从小到大顺序
public class MyStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
