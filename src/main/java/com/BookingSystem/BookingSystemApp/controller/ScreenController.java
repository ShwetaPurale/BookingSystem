package com.BookingSystem.BookingSystemApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingSystem.BookingSystemApp.models.Screen;
import com.BookingSystem.BookingSystemApp.services.ScreenService;

@RestController
@RequestMapping("/api/screens")
public class ScreenController {
	
	@Autowired
    private ScreenService screenService;

    @PostMapping("/configure")
    public ResponseEntity<Screen> configureScreen(@RequestBody Screen screen) {
        return new ResponseEntity<>(screenService.configureScreen(screen), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Screen>> getAllScreens() {
        return new ResponseEntity<>(screenService.getAllScreens(), HttpStatus.OK);
    }

}
