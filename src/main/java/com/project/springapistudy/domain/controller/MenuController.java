package com.project.springapistudy.domain.controller;

import com.project.springapistudy.domain.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.dto.req.UpdateMenuReqDto;
import com.project.springapistudy.domain.dto.res.GetMenuResDto;
import com.project.springapistudy.domain.service.RegisterMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//등록 : [POST] /menu
//조회 : [GET] /menu/{id}
//수정 : [PUT] /menu/{id}
//삭제 : [DELETE] /menu/{id}

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {

    private final RegisterMenuService registerMenuService;

    @PostMapping
    public ResponseEntity<Void> registerMenu(@RequestBody RegisterMenuReqDto reqDto) {
        registerMenuService.execute(reqDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetMenuResDto> getMenu(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMenu(@PathVariable Long id, UpdateMenuReqDto reqDto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id) {
        return null;
    }
}
