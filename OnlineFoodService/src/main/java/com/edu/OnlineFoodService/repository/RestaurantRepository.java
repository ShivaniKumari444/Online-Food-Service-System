package com.edu.OnlineFoodService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.OnlineFoodService.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

 
}
