package com.example.userapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	@GetMapping("/")
	public String Hello() {
		return "Hello this is user app";
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userservice.getUsers();
	}
	
	@PostMapping("/addusers")
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
}
