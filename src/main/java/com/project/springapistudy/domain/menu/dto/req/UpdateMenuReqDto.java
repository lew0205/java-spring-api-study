package com.project.springapistudy.domain.menu.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMenuReqDto {

    private String name;
    private Long price;

//    public UpdateMenuReqDto(String name) {
//        this.name = name;
//    }
//
//    public UpdateMenuReqDto(Long price) {
//        this.price = price;
//    }
}