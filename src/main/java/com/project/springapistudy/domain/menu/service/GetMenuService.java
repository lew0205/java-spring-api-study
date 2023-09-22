package com.project.springapistudy.domain.menu.service;

import com.project.springapistudy.domain.menu.dto.res.GetMenuResDto;

public interface GetMenuService {

    GetMenuResDto execute(Long id);
}
