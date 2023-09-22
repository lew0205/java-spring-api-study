package com.project.springapistudy.domain.controller;

import com.project.springapistudy.domain.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.dto.req.UpdateMenuReqDto;
import com.project.springapistudy.domain.dto.res.GetMenuResDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    //등록 : [POST] /menu
    //조회 : [GET] /menu/{id}
    //수정 : [PUT] /menu/{id}
    //삭제 : [DELETE] /menu/{id}

    @PostMapping
    public void registerMenu(RegisterMenuReqDto reqDto) {

    }

    @GetMapping("/{id}")
    public GetMenuResDto getMenu() {
        return null;
    }

    @PutMapping("/{id}")
    public void updateMenu(UpdateMenuReqDto reqDto) {

    }

    @DeleteMapping("/{id}")
    public void deleteMenu() {

    }
}
