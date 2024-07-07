package com.BookingSystem.BookingSystemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookingSystem.BookingSystemApp.models.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
