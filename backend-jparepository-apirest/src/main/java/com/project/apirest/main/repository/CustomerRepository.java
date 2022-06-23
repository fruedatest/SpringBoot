package com.project.apirest.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apirest.main.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	void save(Optional<Customer> customerToUpdate);

}
