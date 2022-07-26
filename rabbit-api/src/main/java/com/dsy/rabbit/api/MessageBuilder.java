package com.dsy.rabbit.api;

import com.dsy.rabbit.api.excpetion.MessageRunTimeException;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
public class MessageBuilder {
    private String messageId;
    private String topic;
    private String messageType=MessageType.CONFIRM;
    private String routingKey="";
    private Map<String, Object> attributes = new HashMap<>();
    private int delayMills;

    private MessageBuilder() {
    }

    public static MessageBuilder create(){
        return new MessageBuilder();
    }

    public MessageBuilder withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public MessageBuilder withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public MessageBuilder withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    public MessageBuilder withAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    public MessageBuilder withAttribute(String key, Object value) {
        this.attributes.put(key, value);
        return this;
    }

    public MessageBuilder withDelayMills(int delayMills) {
        this.delayMills = delayMills;
        return this;
    }

    public MessageBuilder withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public Message build(){
       // 1. check messageId
        if(StringUtils.isBlank(messageId)) {
            messageId = UUID.randomUUID().toString();
        }
        // 2. topic is null
        if(StringUtils.isBlank(topic)) {
            throw new MessageRunTimeException("this topic is null");
        }
        return new Message(messageId,topic,messageType,routingKey,attributes,delayMills);
    }
}
