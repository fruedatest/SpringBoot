package com.project.apirest.model.services;

import java.util.List;
import com.project.apirest.model.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
