package com.project.springapistudy.domain.menu.controller;

import com.project.springapistudy.domain.menu.dto.req.RegisterMenuReqDto;
import com.project.springapistudy.domain.menu.dto.req.UpdateMenuReqDto;
import com.project.springapistudy.domain.menu.dto.res.GetMenuResDto;
import com.project.springapistudy.domain.menu.service.GetMenuService;
import com.project.springapistudy.domain.menu.service.RegisterMenuService;
import com.project.springapistudy.domain.menu.service.UpdateMenuService;
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
    private final GetMenuService getMenuService;
    private final UpdateMenuService updateMenuService;

    @PostMapping
    public ResponseEntity<Void> registerMenu(@RequestBody RegisterMenuReqDto reqDto) {
        registerMenuService.execute(reqDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetMenuResDto> getMenu(@PathVariable Long id) {
        return ResponseEntity.ok(getMenuService.execute(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateMenu(@PathVariable Long id, @RequestBody UpdateMenuReqDto reqDto) {
        updateMenuService.execute(id, reqDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id) {
        return null;
    }
}
