package com.friday.marvel.exceptions;

import org.springframework.data.domain.Pageable;

public interface PageableValidator {

    void validate(Pageable pageable);
}
