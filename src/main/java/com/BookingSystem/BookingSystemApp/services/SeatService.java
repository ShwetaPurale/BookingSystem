package com.BookingSystem.BookingSystemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.Seat;
import com.BookingSystem.BookingSystemApp.repository.SeatRepository;


@Service
public class SeatService {
	
	 @Autowired
	    private SeatRepository seatRepos;

	    public List<Seat> getSeatsByIds(List<Long> ids) {
	        return seatRepos.findAllById(ids);
	    }

}
