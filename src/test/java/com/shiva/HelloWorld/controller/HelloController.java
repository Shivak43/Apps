package com.shiva.HelloWorld.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/s")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}