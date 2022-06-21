package com.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/codeOk")
	public ModelAndView getCodeOk() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setStatus(HttpStatus.OK);
		modelAndView.setViewName("index.html");
		
		return modelAndView;
	}
	
	@GetMapping("/codeBad")
	public ModelAndView getCodeBad() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setStatus(HttpStatus.BAD_REQUEST);
		modelAndView.setViewName("index.html");
		
		return modelAndView;
	}
}
