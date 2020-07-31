package com.raven.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.raven.springmvcboot.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{

	List<Alien> findByAname(String aname); //Query DSL
	
	@Query("from Alien where aname= :name")
	List<Alien> find(@Param("name") String aname);
	
}
