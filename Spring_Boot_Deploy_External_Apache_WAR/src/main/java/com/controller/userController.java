package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	
	@GetMapping("/hello_world")
	public String say_hello() {
		return "Test - Hello World ..";
	}

}
