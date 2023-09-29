package com.project.springapistudy.domain.menu.repository;

import com.project.springapistudy.domain.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
