package com.raven.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

}
