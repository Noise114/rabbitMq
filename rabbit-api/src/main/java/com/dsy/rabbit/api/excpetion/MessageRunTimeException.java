package com.dsy.rabbit.api.excpetion;

import lombok.Data;

@Data
public class MessageRunTimeException extends RuntimeException {
    private static final long serialVersionUID = 8651828913888663267L;

    public MessageRunTimeException(String message) {
        super(message);
    }

    public MessageRunTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageRunTimeException(Throwable cause) {
        super(cause);
    }

    protected MessageRunTimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
