package com.BookingSystem.BookingSystemApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.User;
import com.BookingSystem.BookingSystemApp.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    private UserRepository userRepository;
	    
	    public User registerUser(User user) {
	        return userRepository.save(user);
	    }

	    public User loginUser(String email, String password) {
	        User user = userRepository.findByEmail(email);
	        if(user != null && user.getPassword().equals(password)) {
	            return user;
	        }
	        return null;
	    }

		public User getUserById(Long userId) {
			// TODO Auto-generated method stub
			return null;
		}

}
