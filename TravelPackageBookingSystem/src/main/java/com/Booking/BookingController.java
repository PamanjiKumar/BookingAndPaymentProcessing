package com.Booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller: BookingController
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
 @Autowired
 private BookingService service;

 @PostMapping("/create")
 public Booking book(@RequestBody Booking booking) {
     return service.createBooking(booking);
 }

 @PostMapping("/payment")
 public Payment pay(@RequestBody Payment payment) {
     return service.processPayment(payment);
 }

 @GetMapping
 public List<Booking> getAllBookings() {
     return service.getBookings();
 }
}
