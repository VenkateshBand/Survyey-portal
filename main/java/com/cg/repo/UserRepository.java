package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.beans.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmailId(String emailId);
	
	 
	public User findByEmailIdAndPassword(String emailId, String password);
	
}
