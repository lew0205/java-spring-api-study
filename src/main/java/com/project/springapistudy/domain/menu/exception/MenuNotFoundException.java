package com.project.springapistudy.domain.menu.exception;

import com.project.springapistudy.global.exception.BasicException;
import com.project.springapistudy.global.exception.ErrorCode;

public class MenuNotFoundException extends BasicException {
    public MenuNotFoundException() {
        super(ErrorCode.MENU_NOT_EXIST);
    }
}
