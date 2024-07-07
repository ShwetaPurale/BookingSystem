package com.BookingSystem.BookingSystemApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FoodItem {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private double price;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public FoodItem(Long id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		public FoodItem() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
	    
	    
}
