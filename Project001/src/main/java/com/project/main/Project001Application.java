package com.project.main;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;



@SpringBootApplication
public class Project001Application {

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Project001Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Project001Application.class, args);
		LOGGER.info("INFO MESSAGE");
		LOGGER.warn("A WARN MESSAGE");
		LOGGER.error("AN ERROR MESSAGE");
		LOGGER.debug("A DEBUG MESSAGE");
		LOGGER.trace("A TRACE MESSAGE");
		
	}
}
