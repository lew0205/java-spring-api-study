package com.project.springapistudy.domain.service;

import com.project.springapistudy.domain.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.repository.MenuRepository;
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
