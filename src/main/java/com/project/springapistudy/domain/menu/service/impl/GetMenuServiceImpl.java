package com.project.springapistudy.domain.menu.service.impl;

import com.project.springapistudy.domain.menu.dto.res.GetMenuResDto;
import com.project.springapistudy.domain.menu.exception.MenuNotFoundException;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.GetMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class GetMenuServiceImpl implements GetMenuService {

    private final MenuRepository menuRepository;

    @Transactional(readOnly = true)
    @Override
    public GetMenuResDto execute(Long id) {
        return new GetMenuResDto(menuRepository.findById(id).orElseThrow(MenuNotFoundException::new));
    }
}
