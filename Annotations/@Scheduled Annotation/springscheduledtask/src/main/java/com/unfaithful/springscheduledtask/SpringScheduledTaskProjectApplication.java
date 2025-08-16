package com.unfaithful.springscheduledtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
	@Scheduled(fixedRate = 5000) annotation needs @EnableScheduling annotation, otherwise it does not work!

 */
@SpringBootApplication
@EnableScheduling
public class SpringScheduledTaskProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringScheduledTaskProjectApplication.class, args);
	}


}
