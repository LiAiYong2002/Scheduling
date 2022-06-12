package com.lay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MytimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytimeApplication.class, args);
    }

}
