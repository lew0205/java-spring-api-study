package com.project.springapistudy.domain.menu;

import com.project.springapistudy.domain.menu.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.menu.dto.res.GetMenuResDto;
import com.project.springapistudy.domain.menu.exception.MenuNotFoundException;
import com.project.springapistudy.domain.menu.repository.MenuRepository;
import com.project.springapistudy.domain.menu.service.GetMenuService;
import com.project.springapistudy.domain.menu.service.RegisterMenuService;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.*;

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
    @DisplayName("메뉴를 주문한다.")
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
        assertSoftly(softAssertions -> {
            assertThat(findMenu.getName()).isEqualTo(menuName);
            assertThat(findMenu.getPrice()).isEqualTo(menuPrice);
        });
    }

    @DisplayName("메뉴를 조회한다.")
    @Test
    void getMenu() {
        //given
        String menuName = "testMenu";
        Long menuPrice = 1234L;
        RegisterMenuReqDto reqDto = new RegisterMenuReqDto(menuName, menuPrice);
        registerMenuService.execute(reqDto); // 서비스 테스트에서 다른 서비스를 호출하는게 맞는것인가?
        Long id = menuRepository.findAll().stream().findFirst().orElseThrow().getId();

        //when
        GetMenuResDto findMenu = getMenuService.execute(id);

        //then
        assertSoftly(softAssertions -> {
            assertThat(findMenu.getName()).isEqualTo(menuName);
            assertThat(findMenu.getPrice()).isEqualTo(menuPrice);
        });
    }
}
