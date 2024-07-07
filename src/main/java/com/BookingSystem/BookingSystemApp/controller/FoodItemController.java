package com.BookingSystem.BookingSystemApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookingSystem.BookingSystemApp.models.FoodItem;
import com.BookingSystem.BookingSystemApp.services.FoodOrderService;

@RestController
@RequestMapping("/api/food")
public class FoodItemController {
	
	 @Autowired
	    private FoodOrderService foodOrderService;

	    @GetMapping("/menu")
	    public ResponseEntity<List<FoodItem>> getMenu() {
	        return new ResponseEntity<>(foodOrderService.getAllFoodItems(), HttpStatus.OK);
	    }

	    @PostMapping("/add")
	    public ResponseEntity<FoodItem> addFoodItem(@RequestBody FoodItem foodItem) {
	        return new ResponseEntity<>(foodOrderService.addFoodItem(foodItem), HttpStatus.CREATED);
	    }

}
