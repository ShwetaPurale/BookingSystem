package com.BookingSystem.BookingSystemApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookingSystem.BookingSystemApp.models.FoodItem;
import com.BookingSystem.BookingSystemApp.repository.FoodRepository;

@Service
public class FoodOrderService {
	
	@Autowired
    private FoodRepository foodItemRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }
    
    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

}
