package com.chuangcius.rabbitmq.app;

import com.chuangcius.rabbitmq.starter.UserClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * EventGenerator
 *
 * @author xugang.song
 * @date 2022.05.08
 */
@Component
class MessageGenerator {

    private final UserClient userClient;

    public MessageGenerator(UserClient userClient) {
        this.userClient = userClient;
    }

    @Scheduled(fixedRate = 2000)
    void generateMessage() {
        userClient.sendMessage("This is a demo message");
    }
}