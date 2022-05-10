package com.chuangcius.greet.starter;

import java.util.Properties;

/**
 * Greet
 *
 * @author xugang.song
 * @date 2022.05.10
 */
public class Greet {

    private final GreetConfig greetConfig;

    public Greet(GreetConfig greetConfig) {
        this.greetConfig = greetConfig;
    }

    public String greet() {
        String name = greetConfig.getProperty("username");
        return String.format("Hello %s, %s", name, greetConfig.get("message"));
    }
}
