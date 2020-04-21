package com.sun3d.why.task.config;


import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Created by xiech on 2018/1/31 0031.
 */
@Configuration
public class SchedulerListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private MyScheduler myScheduler;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try {
            myScheduler.scheduleJobs();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean=new SchedulerFactoryBean();
        return schedulerFactoryBean;
    }
}
