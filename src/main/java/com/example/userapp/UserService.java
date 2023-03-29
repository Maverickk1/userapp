package com.example.userapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepo;
	
	public UserService() {
		
	}
	
	public List<User> getUsers(){
		return userrepo.findAll();
	}
	
	public User saveUser(User user) {
		return userrepo.save(user);
	}

}
