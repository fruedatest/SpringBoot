package com.project.apirest.main.service;

import java.util.List;

import com.project.apirest.main.entities.Customer;

public interface CustomerService {
	
	public List<Customer> findAllCustomers();
}
