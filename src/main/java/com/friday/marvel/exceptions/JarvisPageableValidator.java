package com.friday.marvel.exceptions;

import org.springframework.data.domain.Pageable;

public class JarvisPageableValidator implements PageableValidator {

    @Override
    public void validate(Pageable pageable) {
        if (pageable == null) {
            throw new PageableException("Empty parameter.");
        } else if (pageable.getPageSize() < 1) {
            throw new PageableException("Limit invalid or below 1.");
        } else if (pageable.getPageSize() > 20) {
            throw new PageableException("Limit greater than 20.");
        }
    }
}
