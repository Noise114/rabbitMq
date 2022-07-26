package com.dsy.rabbit.api;

import com.dsy.rabbit.api.excpetion.MessageException;
import com.dsy.rabbit.api.excpetion.MessageRunTimeException;

import java.util.List;

public interface messageProducer {
    /**
     * 发送消息
     * @throws MessageRunTimeException
     */
    void send(Message message) throws MessageRunTimeException;
    /**
     * 发送批量消息
     * @throws MessageRunTimeException
     */
    void send(List<Message> messages) throws MessageRunTimeException;
    /**
     * 发送消息,附带回调
     * @throws MessageRunTimeException
     */
    void send(Message message,SendCallback sendCallback) throws MessageRunTimeException;
}
