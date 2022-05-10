package com.chuangcius.greet.app;

import com.chuangcius.greet.starter.Greet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * EventGenerator
 *
 * @author xugang.song
 * @date 2022.05.08
 */
@Slf4j
@Component
class MessageGenerator {

    @Resource
    private Greet greet;

    @Scheduled(fixedRate = 2000)
    void generateMessage() {
        log.info(greet.greet());
    }
}