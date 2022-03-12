package com.edu.OnlineFoodService.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.OnlineFoodService.entity.Customer;
import com.edu.OnlineFoodService.exception.ResourceNotFound;
import com.edu.OnlineFoodService.repository.CustomerRepository;
import com.edu.OnlineFoodService.services.CustomerServices;
@Service

public class CustomerServiceimpl implements CustomerServices {
private CustomerRepository customerRepository;
	 public CustomerServiceimpl(CustomerRepository customerRepository) {
		 super();
		 this.customerRepository=customerRepository;
	}
	 @Override
      public Customer saveCustomer(Customer customer) {
      return customerRepository.save(customer);
		}

@Override
public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
}

@Override
public Customer getCustomerById(long id) {
			Optional<Customer> customer=customerRepository.findById(id);
			if(customer.isPresent()) {
				return customer.get();
			}
			else {
				throw new ResourceNotFound("Customer","Id",id);
			}
		}
		

@Override
public Customer updateCustomer(Customer customer  , long id) {
				Customer cust= new Customer();
			 try {
				   cust = customerRepository.findById(id).orElseThrow(
						 ()-> 		 new ResourceNotFound("Customer","Id",id));
			} catch (ResourceNotFound e) {
				
				e.printStackTrace();
			}
		
			 cust.setName(cust.getName());
			 cust.setContact_Number(cust.getContact_Number());
			 cust.setEmail(cust.getEmail());
			 
			 
			 customerRepository.save(cust);
			return cust;
}      

}
