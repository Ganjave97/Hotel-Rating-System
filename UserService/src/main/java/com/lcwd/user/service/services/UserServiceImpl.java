package com.lcwd.user.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.exception.ResourceNotFoundException;
import com.lcwd.user.service.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		//generate unique id
		String randomUserId=UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id not found on server  !!:"+userId));
	}
	
	 @Override
	    public void deleteUser(String userId) {
	        User user = userRepository.findById(userId)
	                                  .orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found"));
	        userRepository.delete(user);
	    }

	    @Override
	    public User updateUser(String userId, User updateUser) {
	        User existingUser = userRepository.findById(userId)
	                                          .orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found"));

	        existingUser.setName(updateUser.getName());
	        existingUser.setEmail(updateUser.getEmail());
	        // Update other fields...

	        return userRepository.save(existingUser);
	    }

	

	/*
	 * @Override public Void deleteUser(String userId) { // TODO Auto-generated
	 * method stub return userRepository.deleteUser(userId); }
	 * 
	 * @Override public User updateUser(String userId, User updateUser) { // TODO
	 * Auto-generated method stub return userRepository.updateUser(userId,
	 * updateUser); }
	 */
	
	

}
