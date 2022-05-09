package com.chuangcius.rabbitmq.starter;

import com.chuangcius.rabbitmq.starter.UserClient;
import com.chuangcius.rabbitmq.starter.UserProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;

import javax.annotation.Resource;

/**
 * RabbitMqUserClient
 *
 * @author xugang.song
 * @date 2022.05.09
 */
@Slf4j
public class RabbitMqUserClient implements UserClient {

    @Resource
    private AmqpTemplate userRabbitTemplate;

    @Resource
    private UserProperties userProperties;

    @Override
    public void sendMessage(String message) {
        userRabbitTemplate.convertAndSend(userProperties.rabbitMqExchange, userProperties.rabbitMqRoutingKey, message);
        log.info("Sending message: {}", message);
    }
}
