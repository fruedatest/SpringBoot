package com.project.apirest.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.apirest.controller.ClienteController;
import com.project.apirest.model.entity.Cliente;
import com.project.apirest.model.services.IClienteService;

@RestController
public class ClienteControllerImpl implements ClienteController{
	
	@Autowired
	IClienteService clienteService;
	
	@RequestMapping	(value = "/clientes", method = RequestMethod.GET, produces="application/json")
	public List<Cliente> getClientes(){
		return clienteService.findAll();
	}
	

}
