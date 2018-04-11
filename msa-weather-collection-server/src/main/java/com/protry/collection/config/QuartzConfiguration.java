package com.protry.collection.config;

import com.protry.collection.job.WeatherDataSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author protry
 */
@Configuration
public class QuartzConfiguration {

    private static final int TIME_QUARTZ = 1800;

    @Bean
    public JobDetail weatherDataSyncJobDetail() {
        return JobBuilder
                .newJob(WeatherDataSyncJob.class)
                .withIdentity("weatherDataSyncJobDetail")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger weatherDataSyncTrigger(){
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(TIME_QUARTZ)
                .repeatForever();
        return TriggerBuilder
                .newTrigger()
                .forJob(weatherDataSyncJobDetail())
                .withIdentity("weatherDataSyncTrigger")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
