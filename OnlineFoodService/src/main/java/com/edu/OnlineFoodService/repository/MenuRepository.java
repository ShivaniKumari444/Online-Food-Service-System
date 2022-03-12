package com.edu.OnlineFoodService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.OnlineFoodService.entity.Menu;
public interface MenuRepository extends JpaRepository<Menu,Long> {

	}


