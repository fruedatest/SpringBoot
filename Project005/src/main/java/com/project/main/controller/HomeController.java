package com.project.main.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.project.main.model.User;

@Controller
public class HomeController {
	
	/*
	 * 
	 */
	@PostMapping("/createUser001")
	@ResponseBody
	public User createUser(@RequestBody User user) {
		
		return user;
	}
	
	/*
	 * OBJECT MAPPER
	 */
	@RequestMapping("/createUser002")
	@ResponseBody
	public ObjectNode createUser002() {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectNode objectNode = objectMapper.createObjectNode();
		objectNode.put("username", "francisco");
		objectNode.put("password", "12345");
		objectNode.put("email", "email@email.com");
		
		return objectNode;
	}
	
	/*
	 * RESPONSE ENTITY
	 */
	@RequestMapping("createUser003")
	@ResponseBody
	public ResponseEntity<String> createUser003(){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity<String>("{\"Username\": \"francisco\", "
				+ "\"Password\": \"password\", "
				+ "\"email\": \"email@email.com\"}",  httpHeaders, HttpStatus.OK);

	}
	
	/*
	 * APPLICATION/JSON
	 */
	@RequestMapping(path = "/createUser004", produces = "application/json")
	@ResponseBody
	public String createUser004() {
		return "{\"Username\": \"francisco004\", "
				+ "\"Password\": \"password004\", "
				+ "\"email\": \"email@email.com\"}";
	}
	
	
	
	
	
	
	
	
	
}
