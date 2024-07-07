package com.BookingSystem.BookingSystemApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.Movie;
import com.BookingSystem.BookingSystemApp.repository.MovieRepository;

@Service
public class MovieService {
	
	 @Autowired
	    private MovieRepository movieRepository;

	    public Movie getMovieById(Long id) {
	        return movieRepository.findById(id).orElse(null);
	    }

}
