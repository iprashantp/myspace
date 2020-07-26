package com.raven.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raven.springmvc.dao.AlienDao;
import com.raven.springmvc.model.Alien;

@Controller
public class HomeController {
	
	@Autowired
	private AlienDao dao;
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Aliens");
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("home page requested");
		return "index";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		m.addAttribute("result",dao.getAliens());
		return "showAliens";
	}
	
	@RequestMapping("/myhome")
	public String homeComing() {
		System.out.println("home page for myhome");
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int a,@RequestParam("num2") int b) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		int sum = a+b;
		mv.addObject("sum",sum);
		return mv;
	}
	private void fhome() {
		// TODO Auto-generated method stub

	}
	@RequestMapping("/addM") //for Model
	public String add(@RequestParam("num1") int a,@RequestParam("num2") int b, Model m) {
		
		int sum = a+b;
		m.addAttribute("sum",sum);
		
		return "result";
	}
	
	@RequestMapping("/addMM") //for ModelMap
	public String add(@RequestParam("num1") int a,@RequestParam("num2") int b, ModelMap m) {
		
		int sum = a+b;
		m.addAttribute("sum",sum);
		
		return "result";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@RequestParam("num1") int aid, @RequestParam("num2") String aname, Model m) {
		Alien a = new Alien();
		a.setAid(aid);
		a.setName(aname);
		m.addAttribute("alien",a);
		return "result";
	}
	
	@RequestMapping("addAlienUsingModelAtt")
	public String addAlienUsingModelAtt(@ModelAttribute("alien") Alien a) {
		System.out.println("in route addAlienUsingModelAtt");
		return "result";
	}
}
