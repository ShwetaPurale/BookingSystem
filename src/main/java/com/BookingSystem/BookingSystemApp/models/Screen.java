package com.BookingSystem.BookingSystemApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Screen {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private int capacity;
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
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public Screen(Long id, String name, int capacity) {
			super();
			this.id = id;
			this.name = name;
			this.capacity = capacity;
		}
		public Screen() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Screen [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
		}
	    
	    

}
