package com.project.backendapp.main.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.backendapp.main.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	void save(Optional<Cliente> clienteToUpdate);
}
