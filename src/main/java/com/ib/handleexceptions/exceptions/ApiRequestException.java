package com.ib.handleexceptions.exceptions;

public class ApiRequestException extends RuntimeException {

    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
