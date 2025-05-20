package com.example.travelbooking.services;

import com.example.travelbooking.entities.Booking;
import com.example.travelbooking.entities.Payment;
import com.example.travelbooking.repositories.BookingRepository;
import com.example.travelbooking.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Booking> listAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long bookingID) {
        bookingRepository.deleteById(bookingID);
    }

    public Payment processPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
