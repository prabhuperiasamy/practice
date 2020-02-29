package com.prabhu.practice;

import com.prabhu.practice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class Scheduler {

    Logger logger= LoggerFactory.getLogger(StudentService.class);
//    @Scheduled(initialDelay = 20000, fixedRate = 10000)
//    public void run() {
//        logger.info("Current time is :: " + Calendar.getInstance().getTime());
//    }

//    @Scheduled(fixedDelay = 10000)
//    public void run() {
//        logger.info("Current time is :: " + Calendar.getInstance().getTime());
//    }

    @Scheduled(cron = "${cron}")
    public void run() {
        logger.info("Current time is :: " + Calendar.getInstance().getTime());
    }



}
