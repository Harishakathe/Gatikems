package com.mindworx.scheduler;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

import com.mindworx.config.AutoWiringSpringBeanJobFactory;
import com.mindworx.job.TempHumidityJob;
import com.mindworx.job.VehicleVtsDataJob;

@Configuration
public class QrtzScheduler {

	public static final Logger log = Logger.getLogger(QrtzScheduler.class);

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
    	log.info("Hello world from Quartz...");
    }

    @Bean
    public SpringBeanJobFactory springBeanJobFactory() {
        AutoWiringSpringBeanJobFactory jobFactory = new AutoWiringSpringBeanJobFactory();
        log.info("Configuring Job factory");

        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public Scheduler scheduler() throws SchedulerException, IOException {

        StdSchedulerFactory factory = new StdSchedulerFactory();
        factory.initialize(new ClassPathResource("quartz.properties").getInputStream());
        int frequencyInSec = 60;
        log.info("Getting a handle to the Scheduler");
        Scheduler scheduler = factory.getScheduler();
        scheduler.setJobFactory(springBeanJobFactory());
        
        JobDetail vtsDataJobDetail = newJob()
    			.ofType(VehicleVtsDataJob.class)
    			.storeDurably()
    			.withIdentity(JobKey.jobKey("VtsDataJob Detail"))
    			.withDescription("inserting data into VtsDataJob")
    			.build();
        Trigger vtsDataTrigger = newTrigger()
        		.forJob(vtsDataJobDetail)
        		.withIdentity(TriggerKey.triggerKey("VtsDataJob_Trigger"))
        		.withDescription("VtsDataJob trigger")
        		.withSchedule(simpleSchedule().withIntervalInSeconds(frequencyInSec).repeatForever())
        		.build(); 
        
        JobDetail tempHumidityJobDetail = newJob()
    			.ofType(TempHumidityJob.class)
    			.storeDurably()
    			.withIdentity(JobKey.jobKey("TempHumidityJob Detail"))
    			.withDescription("inserting data into TempHumidity")
    			.build();
        Trigger tempHumidityTrigger = newTrigger()
        		.forJob(tempHumidityJobDetail)
        		.withIdentity(TriggerKey.triggerKey("TempHumidityJob_Trigger"))
        		.withDescription("TempHumidityJob trigger")
        		.withSchedule(simpleSchedule().withIntervalInSeconds(frequencyInSec).repeatForever())
        		.build(); 
        
        //scheduler.scheduleJob(vtsDataJobDetail, vtsDataTrigger);
        //scheduler.scheduleJob(tempHumidityJobDetail, tempHumidityTrigger);

        log.info("Starting Scheduler threads");
        scheduler.start();
        return scheduler;
    }
    
/*
	@Bean
    public JobDetail jobDetail() {

        return newJob().ofType(VehicleVtsDataJob.class).storeDurably().withIdentity(JobKey.jobKey("Qrtz_Job_Detail")).withDescription("Invoke Sample Job service...").build();
    }

    @Bean
    public Trigger trigger(JobDetail job) {

        int frequencyInSec = 10;
        logger.info("Configuring trigger to fire every {} seconds", frequencyInSec);

        return newTrigger().forJob(job).withIdentity(TriggerKey.triggerKey("Qrtz_Trigger")).withDescription("Sample trigger").withSchedule(simpleSchedule().withIntervalInSeconds(frequencyInSec).repeatForever()).build();
    }*/
}