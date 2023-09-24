package com.project.springapistudy.domain.menu.dto.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateMenuReqDto {

    @NotNull
    private String name;
    @NotNull
    private Long price;
}