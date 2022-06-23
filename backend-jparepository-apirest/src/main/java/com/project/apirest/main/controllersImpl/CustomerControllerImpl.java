package com.project.apirest.main.controllersImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.apirest.main.controllers.CustomerController;
import com.project.apirest.main.entities.Customer;
import com.project.apirest.main.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController{
	
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces="application/json")
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerService.findAllCustomers();
	}
}
