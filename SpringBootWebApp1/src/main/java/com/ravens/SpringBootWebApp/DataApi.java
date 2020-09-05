package com.ravens.SpringBootWebApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravens.SpringBootWebApp.dao.UserRepo;

@RestController
public class DataApi {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/getUserAllDetails")
	public List<UserRegistration> getAllData(){
		return (List<UserRegistration>) repo.findAll();
	}
	
	@RequestMapping("/getUserByID/{uid}")
	public Optional<UserRegistration> getRecordsByID(@PathVariable("uid") Long Id){
		System.out.println("in route /getUserByID/{"+Id+"}");
		return repo.findById(Id);
	}

}
