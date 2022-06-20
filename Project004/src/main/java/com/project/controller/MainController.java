package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/index")
	public ModelAndView indexWeb() {
		ModelAndView modelAndViewIndex = new ModelAndView();
		modelAndViewIndex.setViewName("index.html");
		
		
		return modelAndViewIndex;
	}
	
	@GetMapping("/login")
	public ModelAndView loginWeb() {
		ModelAndView modelAndViewLogin = new ModelAndView();
		modelAndViewLogin.setViewName("login.html");
		
		return modelAndViewLogin;
	}
	
	@GetMapping("/newsletter")
	public ModelAndView newsletterWeb() {
		ModelAndView modelAndViewNewsletter = new ModelAndView();
		modelAndViewNewsletter.setViewName("newsletter.html");
		
		return modelAndViewNewsletter;
	}
	
	
}
