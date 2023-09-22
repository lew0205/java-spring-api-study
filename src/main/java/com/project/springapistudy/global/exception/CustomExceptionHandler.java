package com.project.springapistudy.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = BasicException.class)
    public ResponseEntity<ErrorResponse> handleBasicException(BasicException e) {
        log.error("{} : {}", e.getErrorCode().name(), e.getErrorCode().getMessage());
        return ErrorResponse.sendError(e);
    }
}
