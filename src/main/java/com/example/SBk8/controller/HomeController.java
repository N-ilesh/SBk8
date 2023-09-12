package com.example.SBk8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi";
	}
}
