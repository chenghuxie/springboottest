package com.sun3d.why.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 自带的
 * Created by xiech on 2018/1/30 0030.
 */
@Configuration
@EnableScheduling
public class ScheduledTasks {

  /*  Cron表达式的格式：秒 分 时 日 月 周 年(可选)。
    字段名                 允许的值                        允许的特殊字符
    秒                         0-59                               , - * /
    分                         0-59                               , - * /
    小时                     0-23                               , - * /
    日                         1-31                               , - * ? / L W C
    月                         1-12 or JAN-DEC         , - * /
    周几                     1-7 or SUN-SAT           , - * ? / L C #
    年 (可选字段)     empty, 1970-2099      , - * /

            “?”字符：表示不确定的值
               “,”字符：指定数个值
               “-”字符：指定一个值的范围
               “/”字符：指定一个值的增加幅度。n/m表示从n开始，每次增加m
               “L”字符：用在日表示一个月中的最后一天，用在周表示该月最后一个星期X
               “W”字符：指定离给定日期最近的工作日(周一到周五)
               “#”字符：表示该月第几个周X。6#3表示该月第3个周五


         2）Cron表达式范例：
    每隔5秒执行一次：*//*5 * * * * ?
    每隔1分钟执行一次：0 *//*1 * * * ?
    每天23点执行一次：0 0 23 * * ?
    每天凌晨1点执行一次：0 0 1 * * ?
    每月1号凌晨1点执行一次：0 0 1 1 * ?
    每月最后一天23点执行一次：0 0 23 L * ?
    每周星期天凌晨1点实行一次：0 0 1 ? * L
    在26分、29分、33分执行一次：0 26,29,33 * * * ?
    每天的0点、13点、18点、21点都执行一次：0 0 0,13,18,21 * * ?*/
   /* @Scheduled(cron="0/59 * * * * ?")
    public void scheduler(){
        System.out.println(">>>>>>>>>>>>>>>>>SchedulingConfig.scheduler");
    }*/
}
