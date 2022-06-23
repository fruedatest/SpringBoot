package com.project.apirest.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.apirest.main.dao.UserRepository;
import com.project.apirest.main.model.User;

@Service
public class UserService {
	
	private final UserRepository userRepository; 
	
	public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	public List<User> findAll(){
		var it = userRepository.findAll();
		
		var users = new ArrayList<User>();
		it.forEach(e -> users.add(e));
		
		return users;
	}
	
}
