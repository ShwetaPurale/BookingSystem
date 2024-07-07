package com.BookingSystem.BookingSystemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookingSystem.BookingSystemApp.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
