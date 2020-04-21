package com.sun3d.why.task.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiech on 2018/1/31 0031.
 */
public class ScheduledJob implements Job {
   private SimpleDateFormat dateFormat(){
       return new SimpleDateFormat("HH:mm:ss");
   }
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("AAAA: The time is now " + dateFormat().format(new Date()));
    }
}
