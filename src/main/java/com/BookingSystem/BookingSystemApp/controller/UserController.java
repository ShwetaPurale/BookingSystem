package com.BookingSystem.BookingSystemApp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingSystem.BookingSystemApp.models.User;
import com.BookingSystem.BookingSystemApp.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	 @Autowired
	    private UserService userService;

	    @PostMapping("/register")
	    public ResponseEntity<User> registerUser(@RequestBody User user) {
	        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);
	    }

	    @PostMapping("/login")
	    public ResponseEntity<User> loginUser(@RequestBody Map<String, String> loginData) {
	        User user = userService.loginUser(loginData.get("email"), loginData.get("password"));
	        if(user != null) {
	            return new ResponseEntity<>(user, HttpStatus.OK);
	        }
	        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    }

}
