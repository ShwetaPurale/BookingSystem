package com.BookingSystem.BookingSystemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookingSystem.BookingSystemApp.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
