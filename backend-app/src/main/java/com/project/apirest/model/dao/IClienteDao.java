package com.project.apirest.model.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.project.apirest.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
	
	void save(Optional<Cliente> clienteToUpdate);

}
