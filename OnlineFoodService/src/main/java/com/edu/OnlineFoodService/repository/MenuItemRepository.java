package com.edu.OnlineFoodService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.OnlineFoodService.entity.MenuItem;
public interface MenuItemRepository extends JpaRepository<MenuItem,Long> {

}



