package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.User;
import com.cg.repo.UserRepository;



@Service
public class RegistrationService {
	
	@Autowired
	private UserRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}

	
}
