package com.project.apirest.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.apirest.main.model.User;

public interface UserRepository extends CrudRepository <User, Long>{

}
