package com.cloud.weather.quartz;

import org.quartz.*;

import java.util.Date;

/**
 * @author bshao
 */
public class HelloJob implements Job {

    public HelloJob() {
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobKey key = context.getJobDetail().getKey();

        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        String jobSays = dataMap.getString("jobSays");
        float myFloatValue = dataMap.getFloat("myFloatValue");

        System.out.println("Hello World! - " + new Date());

        System.err.println("Instance " + key + " of DumbJob says: " + jobSays + ", and val is: " + myFloatValue);
    }
}
