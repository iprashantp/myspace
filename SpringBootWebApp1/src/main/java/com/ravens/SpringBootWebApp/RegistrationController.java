package com.ravens.SpringBootWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ravens.SpringBootWebApp.dao.UserRepo;

@Controller
public class RegistrationController {
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/regform") 
	public String register() {
		System.out.println("in regform route");
		return "registration";
	}
	
//	@RequestMapping("/userDetail")
//	public ModelAndView userInfo(UserRegistration reg) {
//		System.out.println("in userDetail route");
//		ModelMap model = new ModelMap();
//		model.addAttribute("name",reg.getUName());
//		model.addAttribute("email",reg.getEmailId());
//		model.addAttribute("gender",reg.getGender()==1?"Male":"Female");
//		model.addAttribute("hobbies",reg.getHobby());
//		
//		ModelAndView mv = new ModelAndView("user-details");
//		mv.addObject("regObj",model);
//		
//		return mv;
//	}
	@RequestMapping("/userDetail")
	public String userInfo(UserRegistration reg) {
		repo.save(reg);
		return "operation";
	}
	@RequestMapping("/operation")
	public ModelAndView operation(Long UId, String ddlFlag) {
		System.out.println(ddlFlag);
		if(ddlFlag.equals("select")) {
			UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());
			return selectRecord(reg);
		}else if(ddlFlag.equals("delete")) {
			repo.deleteById(UId);
		}else if(ddlFlag.equals("update")) {
			UserRegistration reg = repo.findById(UId).orElse(new UserRegistration());
			repo.save(reg);
		}
		return new ModelAndView("user-details");
	}
	
	private ModelAndView selectRecord(UserRegistration reg) {
		ModelMap model = new ModelMap();
		model.put("name",reg.getUName());
		model.put("email",reg.getEmailId());
		model.put("gender", reg.getGender());
		
		ModelAndView mv = new ModelAndView("user-details");
		mv.addObject("regObj", model);
		return mv;
	}
	
}
