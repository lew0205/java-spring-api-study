package com.project.springapistudy.domain.menu;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long price;

    public void updateCoffeeName(String name) {
        this.name = name;
    }

    public void updateCoffeePrice(Long price) {
        this.price = price;
    }

    @Builder
    public Menu(String name, Long price) {
        this.name = name;
        this.price = price;
    }
}
