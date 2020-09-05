package com.ravens.SpringBootWebApp.dao;

import org.springframework.data.repository.CrudRepository;
import com.ravens.SpringBootWebApp.UserRegistration;

public interface UserRepo extends CrudRepository<UserRegistration, Long>{}
