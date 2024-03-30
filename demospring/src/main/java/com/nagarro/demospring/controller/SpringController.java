package com.nagarro.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
	@GetMapping("/Demo")
	public String myName() {
		return "Welcome to Demo Project";
	}
	
}
