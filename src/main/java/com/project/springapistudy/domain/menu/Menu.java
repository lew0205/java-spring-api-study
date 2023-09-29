package com.project.springapistudy.domain.menu;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    private boolean deleted = false;

    public void updateMenu(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public void deleteMenu() {
        deleted = true;
    }

    public void restoreMenu() {
        deleted = false;
    }

    @Builder
    public Menu(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
