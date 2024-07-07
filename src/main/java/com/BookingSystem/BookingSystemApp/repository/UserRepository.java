package com.BookingSystem.BookingSystemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookingSystem.BookingSystemApp.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
