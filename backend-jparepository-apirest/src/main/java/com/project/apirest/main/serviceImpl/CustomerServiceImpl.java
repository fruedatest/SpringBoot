package com.project.apirest.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.apirest.main.entities.Customer;
import com.project.apirest.main.repository.CustomerRepository;
import com.project.apirest.main.service.CustomerService;


@RestController
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	
	
	
	
	
	
	
	
}
