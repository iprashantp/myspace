package com.raven.springmvcboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		System.out.println("home page requested");
		return "index.jsp";
	}
	
	@RequestMapping("/myhome")
	public String homeComing() {
		System.out.println("home page for myhome");
		return "index.jsp";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int num = a+b;
		
		HttpSession session = req.getSession();
		
		session.setAttribute("sum",num);
		return("result.jsp");
	}
}
