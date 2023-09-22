package com.project.springapistudy.domain.menu.service;

import com.project.springapistudy.domain.menu.dto.req.UpdateMenuReqDto;

public interface UpdateMenuService {
    void execute(Long id, UpdateMenuReqDto reqDto);
}
