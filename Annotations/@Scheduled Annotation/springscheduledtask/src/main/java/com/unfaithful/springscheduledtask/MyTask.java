package com.unfaithful.springscheduledtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {


    @Scheduled(fixedRate = 5000) // Schedule the task to run every 5 seconds (fixedRate in milliseconds)
    public void runTask() {
        System.out.println("Task is running!");
    }
}
