package com.playground.squash.model.exception;

public class EndOfGameException extends Exception {

    public EndOfGameException() {
        super();
    }

    public EndOfGameException(String message) {
        super(message);
    }

    public EndOfGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public EndOfGameException(Throwable cause) {
        super(cause);
    }

    protected EndOfGameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
