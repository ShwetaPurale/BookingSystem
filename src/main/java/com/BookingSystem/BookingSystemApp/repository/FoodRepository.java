package com.BookingSystem.BookingSystemApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookingSystem.BookingSystemApp.models.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Long> {

}
