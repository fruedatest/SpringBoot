package com.project.backendapp.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.backendapp.main.entities.Cliente;
import com.project.backendapp.main.repository.ClienteRepository;
import com.project.backendapp.main.service.ClienteService;

@RestController
public class CustomerServiceImpl implements ClienteService{
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAllClientes() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}
	
	

}
