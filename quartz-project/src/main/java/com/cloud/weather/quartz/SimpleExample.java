package com.cloud.weather.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * @author bshao
 */
public class SimpleExample {

    public static void main(String[] args) {
        try {
            new SimpleExample().run();
        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Scheduler
     * <p>
     * JobDetail
     * <p>
     * Trigger
     *
     * @throws SchedulerException
     * @throws InterruptedException
     */
    public void run() throws SchedulerException, InterruptedException {

        System.out.println("--------初始化 ----------------------");

        //首先要实例化scheduler
        SchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();

        System.out.println("---------初始化完成------------------");

        //获取给定时间的下一个完整分钟的时间
        Date runTime = DateBuilder.evenMinuteDate(new Date());

        System.out.println("----------Job安排---------------------");

        //获取Job实例
        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity("job1", "group1")
                .usingJobData("myJob", "group1")
                .usingJobData("jobSays", "Hello World!")
                .usingJobData("myFloatValue", 3.15f)
                .build();

        //在下一轮分钟触发运行
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").startAt(runTime).build();

        //告诉quartz使用某个trigger执行某个job
        scheduler.scheduleJob(job, trigger);
        System.out.println(job.getKey() + " 将会运行于: " + runTime);

        // 启动scheduler
        scheduler.start();

        System.out.println("------- 开始安排 -----------------");

        System.out.println("------- 等待65秒 -------------");
        Thread.sleep(65L * 1000L);

        // 关闭scheduler
        System.out.println("------- 关闭 ---------------------");
        scheduler.shutdown(true);
        System.out.println("------- 关闭完成 -----------------");
    }
}
