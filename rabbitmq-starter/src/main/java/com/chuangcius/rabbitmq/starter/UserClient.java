package com.chuangcius.rabbitmq.starter;

/**
 * UserClient
 *
 * @author xugang.song
 * @date 2022.05.09
 */
public interface UserClient {

    /**
     * 发送消息
     *
     * @param message 消息内容
     */
    void sendMessage(String message);
}
