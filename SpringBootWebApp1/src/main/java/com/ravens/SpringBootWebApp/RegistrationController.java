package com.ravens.SpringBootWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@RequestMapping("/regform")
	public String register() {
		System.out.println("in regform route");
		return "registration";
	}
	
	@RequestMapping("/userDetail")
	public ModelAndView userInfo(UserRegistration reg) {
		System.out.println("in userDetail route");
		ModelMap model = new ModelMap();
		model.addAttribute("name",reg.getUName());
		model.addAttribute("email",reg.getEmailId());
		model.addAttribute("gender",reg.getGender()==1?"Male":"Female");
		model.addAttribute("hobbies",reg.getHobby());
		
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj",model);
		
		return mv;
	}
	
}
