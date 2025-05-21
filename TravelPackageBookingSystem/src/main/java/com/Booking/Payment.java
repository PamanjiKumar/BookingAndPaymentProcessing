package com.Booking;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Entity: Payment
@Entity
public class Payment {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long paymentId;

 private Long userId;
 private Long bookingId;
 private double amount;
 private String status;
 private String paymentMethod;
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public Long getBookingId() {
	return bookingId;
}
public void setBookingId(Long bookingId) {
	this.bookingId = bookingId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}

 // Getters and Setters
}