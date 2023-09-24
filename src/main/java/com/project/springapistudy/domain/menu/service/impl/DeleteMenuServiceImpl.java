package com.project.springapistudy.domain.menu.service.impl;

import com.project.springapistudy.domain.menu.Menu;
import com.project.springapistudy.domain.menu.exception.MenuNotFoundException;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.DeleteMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteMenuServiceImpl implements DeleteMenuService {

    private final MenuRepository menuRepository;

    @Override
    public void execute(Long id) {
        Menu menu = menuRepository.findById(id).orElseThrow(MenuNotFoundException::new);
        menu.deleteMenu();
    }
}
