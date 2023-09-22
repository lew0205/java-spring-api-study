package com.project.springapistudy.domain.dto.req;


import com.project.springapistudy.domain.Menu;
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
