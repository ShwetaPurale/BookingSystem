package com.BookingSystem.BookingSystemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.Booking;
import com.BookingSystem.BookingSystemApp.models.Movie;
import com.BookingSystem.BookingSystemApp.models.Seat;
import com.BookingSystem.BookingSystemApp.models.User;
import com.BookingSystem.BookingSystemApp.repository.BookingRepository;
import com.BookingSystem.BookingSystemApp.repository.SeatRepository;

@Service
public class BookingService {
	
	 @Autowired
	    private BookingRepository bookingRepository;
	    @Autowired
	    private SeatRepository seatRepository;

	    public Booking bookTickets(User user, Movie movie, List<Seat> seats, double totalPrice) {
	        Booking booking = new Booking();
	        booking.setUser(user);
	        booking.setMovie(movie);
	        booking.setSeats(seats);
	        booking.setTotalPrice(totalPrice);
	        for(Seat seat : seats) {
	            seat.setBooked(true);
	            seatRepository.save(seat);
	        }
	        return bookingRepository.save(booking);
	    }

}
