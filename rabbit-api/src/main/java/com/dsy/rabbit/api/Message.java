package com.dsy.rabbit.api;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Message {
    /** 消息的唯一ID */
    private String messageId;
    /** 消息的主题 */
    private String topic;
    /** 消息的类型 */
    private String messageType=MessageType.CONFIRM;
    /** 消息的路由键 */
    private String routingKey="";
    /**	消息的附加属性*/
    private Map<String, Object> attributes = new HashMap<>();
    /**	延时消息配置*/
    private int delayMills;

    public Message(){

    }
    public Message(String messageId, String topic, String routingKey, Map<String, Object> attributes, int delayMills) {
        this.messageId = messageId;
        this.topic = topic;
        this.routingKey = routingKey;
        this.attributes = attributes;
        this.delayMills = delayMills;
    }

    public Message(String messageId, String topic, String messageType, String routingKey, Map<String, Object> attributes, int delayMills) {
        this.messageId = messageId;
        this.topic = topic;
        this.messageType = messageType;
        this.routingKey = routingKey;
        this.attributes = attributes;
        this.delayMills = delayMills;
    }
}
