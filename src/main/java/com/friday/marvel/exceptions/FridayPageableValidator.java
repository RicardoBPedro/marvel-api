package com.friday.marvel.exceptions;

import org.springframework.data.domain.Pageable;

public class FridayPageableValidator implements PageableValidator {

    @Override
    public void validate(Pageable pageable) {
        if (pageable == null) {
            throw new PageableException("Empty parameter.");
        } else if (pageable.getPageSize() < 1) {
            throw new PageableException("Limit invalid or below 1.");
        } else if (pageable.getPageSize() > 100) {
            throw new PageableException("Limit greater than 100.");
        }
    }
}
