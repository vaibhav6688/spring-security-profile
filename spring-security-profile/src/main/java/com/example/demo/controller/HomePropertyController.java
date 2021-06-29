package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePropertyController {

	//to get value from application properties file
	@Value("${spring.profiles.active}")
	private String name;
	
	@GetMapping("/")
	public String homeController(){
		return "server.profile.active: " + name;
	}
	
}
