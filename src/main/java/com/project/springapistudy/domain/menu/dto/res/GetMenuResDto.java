package com.project.springapistudy.domain.menu.dto.res;

import com.project.springapistudy.domain.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetMenuResDto {

    private final Long id;
    private final String name;
    private final Long price;
    private final boolean deleted;

    public GetMenuResDto(Menu menu) {
        id = menu.getId();
        name = menu.getName();
        price = menu.getPrice();
        deleted = menu.isDeleted();
    }
}
