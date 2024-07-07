package com.BookingSystem.BookingSystemApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String row;
	    private int number;
	    private boolean isBooked;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getRow() {
			return row;
		}
		public void setRow(String row) {
			this.row = row;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public boolean isBooked() {
			return isBooked;
		}
		public void setBooked(boolean isBooked) {
			this.isBooked = isBooked;
		}
		public Seat(Long id, String row, int number, boolean isBooked) {
			super();
			this.id = id;
			this.row = row;
			this.number = number;
			this.isBooked = isBooked;
		}
		public Seat() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Seat [id=" + id + ", row=" + row + ", number=" + number + ", isBooked=" + isBooked + "]";
		}
	    
	    

}
