package com.project.springapistudy.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    MENU_NOT_EXIST("찾으시는 메뉴가 존재하지 않습니다", 400)
    ;
    private final String message;
    private final int code;
}
