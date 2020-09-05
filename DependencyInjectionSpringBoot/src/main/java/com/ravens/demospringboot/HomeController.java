package com.ravens.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/Home")
	public String home() {
		return "hello Home page!";
	}
	
	@RequestMapping("/About")
	public String about() {
		return "hello about us!"; 
	}
}
