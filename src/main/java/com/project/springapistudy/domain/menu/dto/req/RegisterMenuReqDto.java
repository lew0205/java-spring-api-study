package com.project.springapistudy.domain.menu.dto.req;


import com.project.springapistudy.domain.menu.Menu;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RegisterMenuReqDto {

    private final String name;
    private final Long price;

    public Menu toEntity() {
        return Menu.builder()
            .name(name)
            .price(price)
            .build();
    }
}
