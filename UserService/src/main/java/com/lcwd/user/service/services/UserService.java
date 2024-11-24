package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.repositories.UserRepository;

public interface UserService {
	
	//user operations
	
	
	
		//create
		User saveUser(User user);
		
		//get all user
		List<User> getAllUser();
		
		//get single user of given userId
		User getUser(String userId);
		
		
		
		  //delete 
		void deleteUser (String userId);
		
		  
		  //Update user 
		User updateUser(String userId,User updateUser);
		 

}
