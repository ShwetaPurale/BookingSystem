package com.BookingSystem.BookingSystemApp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingSystem.BookingSystemApp.models.Booking;
import com.BookingSystem.BookingSystemApp.models.Movie;
import com.BookingSystem.BookingSystemApp.models.Seat;
import com.BookingSystem.BookingSystemApp.models.User;
import com.BookingSystem.BookingSystemApp.services.BookingService;
import com.BookingSystem.BookingSystemApp.services.MovieService;
import com.BookingSystem.BookingSystemApp.services.SeatService;
import com.BookingSystem.BookingSystemApp.services.UserService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	 @Autowired
	    private BookingService bookingService;
	    
	    @Autowired
	    private UserService userService;
	    
	    @Autowired
	    private MovieService movieService;
	    
	    @Autowired
	    private SeatService seatService;

	    @PostMapping("/reserve")
	    public ResponseEntity<Booking> reserveTickets(@RequestBody Map<String, Object> bookingData) {
	        try {
	            // Fetch user from bookingData
	            Long userId = Long.parseLong(bookingData.get("userId").toString());
	            User user = userService.getUserById(userId);

	            // Fetch movie from bookingData
	            Long movieId = Long.parseLong(bookingData.get("movieId").toString());
	            Movie movie = movieService.getMovieById(movieId);

	            // Fetch seats from bookingData
	            List<Long> seatIds = (List<Long>) bookingData.get("seatIds");
	            List<Seat> seats = seatService.getSeatsByIds(seatIds);

	            // Fetch totalPrice from bookingData
	            double totalPrice = Double.parseDouble(bookingData.get("totalPrice").toString());

	            // Book tickets
	            Booking booking = bookingService.bookTickets(user, movie, seats, totalPrice);

	            return new ResponseEntity<>(booking, HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	        }
	    }

}
