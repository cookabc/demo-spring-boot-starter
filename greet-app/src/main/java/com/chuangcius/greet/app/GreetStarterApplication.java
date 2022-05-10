package com.chuangcius.greet.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * GreetStarterApplication
 *
 * @author xugang.song
 * @date 2022.05.10
 */
@EnableScheduling
@SpringBootApplication
public class GreetStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetStarterApplication.class, args);
    }
}
