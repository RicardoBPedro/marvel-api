package com.friday.marvel.exceptions;

public class PageableException extends RuntimeException {

    public PageableException(String message) {
        super(message);
    }

    public PageableException(String message, Throwable cause) {
        super(message, cause);
    }
}
