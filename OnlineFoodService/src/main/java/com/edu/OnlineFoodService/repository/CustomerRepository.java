package com.edu.OnlineFoodService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.OnlineFoodService.entity.Customer;
public interface   CustomerRepository extends JpaRepository<Customer,Long> {

}
