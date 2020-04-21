package com.sun3d.why.task.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by xiech on 2018/1/31 0031.
 */

public class ScheduledJob2 implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("haha");
    }
}
