package com.project.springapistudy.domain.menu;

import com.project.springapistudy.domain.menu.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.menu.exception.MenuNotFoundException;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.GetMenuService;
import com.project.springapistudy.domain.menu.service.RegisterMenuService;
import org.hibernate.annotations.Comment;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class MenuServiceTest {

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private RegisterMenuService registerMenuService;
    @Autowired
    private GetMenuService getMenuService;

    @Order(0)
    @Comment("메뉴를 주문한다.")
    @Test
    void registerMenu() {
        //given
        String menuName = "testMenu";
        Long menuPrice = 1234L;
        RegisterMenuReqDto reqDto = new RegisterMenuReqDto(menuName, menuPrice);

        //when
        registerMenuService.execute(reqDto);

        //then
        Menu findMenu = menuRepository.findAll().stream().findFirst().orElseThrow(MenuNotFoundException::new);
        assertThat(findMenu.getName()).isEqualTo(menuName);
        assertThat(findMenu.getPrice()).isEqualTo(menuPrice);
    }
}
