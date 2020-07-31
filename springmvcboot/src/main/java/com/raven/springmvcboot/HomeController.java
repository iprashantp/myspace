package com.raven.springmvcboot;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raven.springmvcboot.model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	
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
		m.addAttribute("result",repo.findAll());
		return "showAliens";
	}
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) {
		m.addAttribute("result",repo.getOne(aid));
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
	
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("num1") int aid, @RequestParam("num2") String aname, Model m) {
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("alien",a);
//		return "result";
//	}
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a) {
		repo.save(a);
		return "result";
	}
	
	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m) {
		m.addAttribute("result",repo.findByAname(aname));
		return "showAliens";
	}
	
	@GetMapping("getAlienByNameQuery")
	public String getAlienByNameQuery(@RequestParam String aname, Model m) {
		System.out.println("in route getAlienByNameQuery");
		m.addAttribute("result",repo.find(aname));
		return "showAliens";
	}
	
	
	@RequestMapping("addAlienUsingModelAtt")
	public String addAlienUsingModelAtt(@ModelAttribute("alien") Alien a) {
		System.out.println("in route addAlienUsingModelAtt");
		return "result";
	}
	
	@GetMapping("getAliens1")
	public String getAliens1(Model m) {
		System.out.println("in getAliens route");
		List<Alien> aliens= Arrays.asList(new Alien(100,"prashant"),new Alien(200,"table"));
		m.addAttribute("result",aliens);
		return "showAliens";
	}
}
