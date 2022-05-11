package com.chuangcius.rabbitmq.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * UserProperties
 *
 * @author xugang.song
 * @date 2022.05.09
 */
@Data
@ConfigurationProperties(prefix = "myrabbit-starter")
public class UserProperties {
    public String rabbitMqExchange;
    public String rabbitMqQueue;
    public String rabbitMqRoutingKey;
}
