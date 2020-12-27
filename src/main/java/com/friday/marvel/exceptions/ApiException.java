package com.friday.marvel.exceptions;

import org.springframework.http.HttpStatus;

// IETF: RFC 7807
public class ApiException {

    private final HttpStatus stats;
    private final String title;
    private final String detail;

    public ApiException(HttpStatus stats, String title, String detail) {
        this.stats = stats;
        this.title = title;
        this.detail = detail;
    }

    public HttpStatus getStats() {
        return stats;
    }

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }
}
