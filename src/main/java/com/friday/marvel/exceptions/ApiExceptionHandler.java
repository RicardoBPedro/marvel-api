package com.friday.marvel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {PageableException.class})
    public ResponseEntity<Object> handlePageableException(PageableException e) {
        ApiException apiException = new ApiException(HttpStatus.CONFLICT, "Incorrect Pageable", e.getMessage());

        return new ResponseEntity<>(apiException, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = {CharacterNotFoundException.class})
    public ResponseEntity<Object> handleCharacterNotFoundException(CharacterNotFoundException e) {
        ApiException apiException = new ApiException(HttpStatus.NOT_FOUND, "Character Not Found", e.getMessage());

        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }
}
