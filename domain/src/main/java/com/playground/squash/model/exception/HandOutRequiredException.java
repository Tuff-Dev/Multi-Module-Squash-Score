package com.playground.squash.model.exception;

public class HandOutRequiredException extends Exception {

    public HandOutRequiredException() {
        super();
    }

    public HandOutRequiredException(String message) {
        super(message);
    }

    public HandOutRequiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandOutRequiredException(Throwable cause) {
        super(cause);
    }

    protected HandOutRequiredException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
