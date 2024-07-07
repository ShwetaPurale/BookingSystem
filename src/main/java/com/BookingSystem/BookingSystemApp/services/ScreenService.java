package com.BookingSystem.BookingSystemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.Screen;
import com.BookingSystem.BookingSystemApp.repository.ScreenRepository;

@Service
public class ScreenService {
	
	 @Autowired
	    private ScreenRepository screenRepository;

	    public Screen configureScreen(Screen screen) {
	        return screenRepository.save(screen);
	    }

	    public List<Screen> getAllScreens() {
	        return screenRepository.findAll();
	    }

}
