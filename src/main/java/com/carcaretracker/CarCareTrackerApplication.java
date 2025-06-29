package com.carcaretracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CarCareTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarCareTrackerApplication.class, args);
    }
}
