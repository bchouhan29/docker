package com.example.docker.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/message")
	public String getMessage()
	{
		return "First docker container running";
		
	}

}
