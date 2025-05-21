package com.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service: BookingService
@Service
public class BookingService {
 @Autowired
 private BookingRepository bookingRepo;
 @Autowired
 private PaymentRepository paymentRepo;

 public Booking createBooking(Booking booking) {
     return bookingRepo.save(booking);
 }

 public Payment processPayment(Payment payment) {
     return paymentRepo.save(payment);
 }

 public List<Booking> getBookings() {
     return bookingRepo.findAll();
 }
}