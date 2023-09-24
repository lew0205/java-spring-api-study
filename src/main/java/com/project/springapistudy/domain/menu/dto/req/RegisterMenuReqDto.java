package com.project.springapistudy.domain.menu.dto.req;


import com.project.springapistudy.domain.menu.Menu;
import lombok.AllArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
public class RegisterMenuReqDto {

    @NotNull
    private final String name;
    @NotNull
    private final Long price;

    public Menu toEntity() {
        return Menu.builder()
            .name(name)
            .price(price)
            .build();
    }
}
