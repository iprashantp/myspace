package com.raven.springmvcboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raven.springmvcboot.model.Alien;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;
	
	@GetMapping(path="aliens",produces= {"application/json"})
	public List<Alien> getAliens() {
		System.out.println("getAliens called");
		List<Alien> aliens = repo.findAll();
		
		return aliens;
	}
	
	@GetMapping("alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int id) {
		Alien alien = repo.findById(id).orElse(new Alien(-1,""));
		return alien;
	}
	
	@PostMapping(path="alien",consumes = {"application/json"})
	public Alien addAlien(@RequestBody Alien a) {
		repo.save(a);
		return a;
	}

}
