package com.project.springapistudy.domain.menu.service.impl;

import com.project.springapistudy.domain.menu.Menu;
import com.project.springapistudy.domain.menu.dto.req.UpdateMenuReqDto;
import com.project.springapistudy.domain.menu.exception.MenuNotFoundException;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.UpdateMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateMenuServiceImpl implements UpdateMenuService {
    private final MenuRepository menuRepository;

    @Override
    public void execute(Long id, UpdateMenuReqDto reqDto) {
        Menu menu = menuRepository.findById(id).orElseThrow(MenuNotFoundException::new);

        String updateName = reqDto.getName();
        Long updatePrice = reqDto.getPrice();
        if (updateName == null) updateName = menu.getName();
        if (updatePrice == null) updatePrice = menu.getPrice();

        menu.updateMenu(updateName, updatePrice);
        menuRepository.save(menu);
    }
}
