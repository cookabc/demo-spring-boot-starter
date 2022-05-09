package com.chuangcius.rabbitmq.starter;

import org.springframework.context.annotation.Import;

/**
 * EnableUserClient
 *
 * @author xugang.song
 * @date 2022.05.09
 */
@Import(UserClientRabbitMqConfig.class)
public @interface EnableUserClientRabbitMq {
}
