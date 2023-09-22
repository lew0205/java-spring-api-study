package com.project.springapistudy.domain.menu.service.impl;

import com.project.springapistudy.domain.menu.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.RegisterMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterMenuServiceImpl implements RegisterMenuService {

    private final MenuRepository menuRepository;

    @Override
    public void execute(RegisterMenuReqDto reqDto) {
        menuRepository.save(reqDto.toEntity());
    }
}
