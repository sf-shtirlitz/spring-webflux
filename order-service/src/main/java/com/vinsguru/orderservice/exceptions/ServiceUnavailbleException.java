package com.vinsguru.orderservice.exceptions;

public class ServiceUnavailbleException extends RuntimeException{
    private static final String MSG = "Service interruption occurred... Try again in a sec!";
    private static final int errorCode = 101;
    private final int input;

    public ServiceUnavailbleException(int input) {
        super(MSG);
        this.input = input;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public int getInput() {
        return input;
    }
}
