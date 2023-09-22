package com.project.springapistudy.global.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@Getter
public class ErrorResponse {

    private final String name;
    private final int code;
    private final String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.name = errorCode.name();
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public static ResponseEntity<ErrorResponse> sendError(BasicException e) {
        return ResponseEntity
            .status(e.getErrorCode().getCode())
            .body(new ErrorResponse(e.getErrorCode()));
    }
}
