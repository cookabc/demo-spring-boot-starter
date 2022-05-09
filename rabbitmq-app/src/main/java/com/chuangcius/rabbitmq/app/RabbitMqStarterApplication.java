package com.chuangcius.rabbitmq.app;

import com.chuangcius.rabbitmq.starter.EnableUserClientRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * RabbitMqStarterApplication
 *
 * @author xugang.song
 * @date 2022.05.09
 */
@EnableUserClientRabbitMq
@EnableScheduling
@SpringBootApplication
public class RabbitMqStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqStarterApplication.class, args);
    }
}
