package com.BookingSystem.BookingSystemApp.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private LocalDateTime showtime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDateTime getShowtime() {
		return showtime;
	}
	public void setShowtime(LocalDateTime showtime) {
		this.showtime = showtime;
	}
	public Movie(Long id, String title, String genre, LocalDateTime showtime) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.showtime = showtime;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", showtime=" + showtime + "]";
	}
    
    
}
