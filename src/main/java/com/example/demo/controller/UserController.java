
package com.example.demo.controller;


import com.example.demo.exception.ResourceNotFoundException;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.exception.BadRequestException;


  @RestController
@RequestMapping("/api/v1")  

public class UserController {

  @Autowired
  private UserRepository userRepository;
  
  @RequestMapping("/hello")
	String helloWorld() {
		return "Hello World, Inside AWS Beanstalk Rajeev!";
	}

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

}