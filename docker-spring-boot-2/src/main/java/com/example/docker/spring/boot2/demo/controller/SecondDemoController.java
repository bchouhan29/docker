package com.example.docker.spring.boot2.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondDemoController {
	
	@GetMapping("/secondMessage")
	public String getMessage()
	{
		return "Second docker container running";
		
	}

}
