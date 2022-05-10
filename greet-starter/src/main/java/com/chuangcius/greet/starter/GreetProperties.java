package com.chuangcius.greet.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * GreeterProperties
 *
 * @author xugang.song
 * @date 2022.05.10
 */
@Data
@ConfigurationProperties(prefix = "greet-starter")
public class GreetProperties {
    private String username;
    private String message;
}
