package com.dsy.rabbit.api;

import lombok.Data;

@Data
public final class MessageType {
    /**
     * 快速消息
     */
    public static final String RAPID = "0";
    /**
     * 确认消息
     */
    public static final String CONFIRM = "1";
    /**
     * 可靠性消息 保障消息的100%可靠性投递,不允许任何消息丢失
     */
    public static final String RELIANT = "2";

}
