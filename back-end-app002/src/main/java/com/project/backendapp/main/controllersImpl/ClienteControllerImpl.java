package com.project.backendapp.main.controllersImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.backendapp.main.controllers.ClienteController;
import com.project.backendapp.main.entities.Cliente;
import com.project.backendapp.main.service.ClienteService;

@RestController
public class ClienteControllerImpl implements ClienteController{

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value="/clientes", method = RequestMethod.GET, produces = "application/json")
	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return clienteService.findAllClientes();
	}

}
