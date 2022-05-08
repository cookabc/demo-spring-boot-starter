package com.chuangcius.event.starter;

import lombok.ToString;
import lombok.Value;

/**
 * Event
 *
 * @author xugang.song
 * @date 2022.05.08
 */
@Value
@ToString
public class Event {
    String type;
    String payload;
}
