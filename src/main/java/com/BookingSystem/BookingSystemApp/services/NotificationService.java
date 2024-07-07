//package com.BookingSystem.BookingSystemApp.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//import com.BookingSystem.BookingSystemApp.models.Booking;
//import com.BookingSystem.BookingSystemApp.models.PhoneNumber;
//import com.BookingSystem.BookingSystemApp.models.Seat;
//import com.BookingSystem.BookingSystemApp.models.User;
//
//@Service
//public class NotificationService {
//	
//	 @Autowired
//	    private JavaMailSender mailSender;
//	    
//	    @Value("${spring.mail.username}")
//	    private String fromEmail;
//	    
//	    @Value("${twilio.accountSid}")
//	    private String twilioAccountSid;
//	    
//	    @Value("${twilio.authToken}")
//	    private String twilioAuthToken;
//	    
//	    @Value("${twilio.phoneNumber}")
//	    private String twilioPhoneNumber;
//
//	    public void sendBookingConfirmation(User user, Booking booking) {
//	        sendEmail(user.getEmail(), "Booking Confirmation", buildBookingConfirmationMessage(user, booking));
//	        sendSms(user.getPhoneNumber(), buildBookingConfirmationMessage(user, booking));
//	    }
//	    
//	    public void sendSeatAvailabilityAlert(User user, Seat seat) {
//	        sendEmail(user.getEmail(), "Seat Availability Alert", buildSeatAvailabilityMessage(user, seat));
//	        sendSms(user.getPhoneNumber(), buildSeatAvailabilityMessage(user, seat));
//	    }
//
//	    private void sendEmail(String toEmail, String subject, String body) {
//	        SimpleMailMessage message = new SimpleMailMessage();
//	        message.setFrom(fromEmail);
//	        message.setTo(toEmail);
//	        message.setSubject(subject);
//	        message.setText(body);
//	        mailSender.send(message);
//	    }
//	    
//	    private void sendSms(String toPhoneNumber, String message) {
//	        Twilio.init(twilioAccountSid, twilioAuthToken);
//	        Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber(twilioPhoneNumber), message).create();
//	    }
//
//	    private String buildBookingConfirmationMessage(User user, Booking booking) {
//	        return "Dear " + user.getName() + ",\n\n" +
//	               "Your booking has been confirmed.\n" +
//	               "Movie: " + booking.getMovie().getTitle() + "\n" +
//	               "Showtime: " + booking.getMovie().getShowtime() + "\n" +
//	               "Seats: " + booking.getSeats().stream().map(seat -> seat.getRow() + seat.getNumber()).collect(Collectors.joining(", ")) + "\n" +
//	               "Total Price: $" + booking.getTotalPrice() + "\n\n" +
//	               "Thank you for booking with us.";
//	    }
//
//	    private String buildSeatAvailabilityMessage(User user, Seat seat) {
//	        return "Dear " + user.getName() + ",\n\n" +
//	               "The seat " + seat.getRow() + seat.getNumber() + " is now available.\n\n" +
//	               "Thank you.";
//	    }
//
//}
