package com.edu.OnlineFoodService.services;

import java.util.List;

import com.edu.OnlineFoodService.entity.Customer;

public interface CustomerServices {

	
	Customer saveCustomer(Customer customer);
	List<Customer> getAllCustomer();
	Customer getCustomerById(long id);
	Customer updateCustomer(Customer customer,long id);
}
