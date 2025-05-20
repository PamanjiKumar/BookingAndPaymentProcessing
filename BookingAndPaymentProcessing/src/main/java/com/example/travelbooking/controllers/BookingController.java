package com.example.travelbooking.controllers;

import com.example.travelbooking.entities.Booking;
import com.example.travelbooking.entities.Payment;
import com.example.travelbooking.services.BookingService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.listAllBookings();
    }

    @PostMapping
    public Booking createBooking(@Valid @RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelBooking(@PathVariable Long id) {
        bookingService.cancelBooking(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/payment")
    public Payment processPayment(@Valid @RequestBody Payment payment) {
        return bookingService.processPayment(payment);
    }
}
