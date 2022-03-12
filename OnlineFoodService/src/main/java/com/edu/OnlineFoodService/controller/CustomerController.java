package com.edu.OnlineFoodService.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.OnlineFoodService.services.CustomerServices;
import com.edu.OnlineFoodService.entity.Customer;
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
private CustomerServices customerService;
public CustomerController(CustomerServices customerService) {
super();
	this.customerService= customerService;
	}
@PostMapping
	  public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
	  return new ResponseEntity<Customer>(customerService.saveCustomer(customer),HttpStatus.CREATED);
	  }
@GetMapping
	public List<Customer> getAllCustomer()
			{
				return customerService.getAllCustomer();
			}
	@GetMapping("{id}")
			public ResponseEntity<Customer>getCustomerById(@PathVariable("id") long id){
				return new ResponseEntity(customerService.getCustomerById(id),HttpStatus.OK);
			}
	@PutMapping("{id}")
			public ResponseEntity<Customer>updateCustomer(@PathVariable("id") long id,@RequestBody Customer customer){
				return new ResponseEntity<Customer>(customerService.updateCustomer(customer,id),HttpStatus.OK);
			}
		}


