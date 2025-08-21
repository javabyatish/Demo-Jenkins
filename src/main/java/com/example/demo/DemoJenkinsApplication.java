package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJenkinsApplication {
	
	
	public static Logger logger=LoggerFactory.getLogger(DemoJenkinsApplication.class);
	
	@GetMapping("/wish/{name}")
	public String getMessage(@PathVariable String name) {
		logger.info("Method execution started::");
		return "Welcome to Jenkins:::    "+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}

}
