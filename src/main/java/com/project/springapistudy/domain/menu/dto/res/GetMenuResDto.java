package com.project.springapistudy.domain.menu.dto.res;

import com.project.springapistudy.domain.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class GetMenuResDto {

    private final Menu menu;

    public GetMenuResDto(Menu menu) {
        this.menu = menu;
    }
}
