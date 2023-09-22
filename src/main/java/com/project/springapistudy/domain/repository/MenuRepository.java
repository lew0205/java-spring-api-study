package com.project.springapistudy.domain.repository;

import com.project.springapistudy.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
