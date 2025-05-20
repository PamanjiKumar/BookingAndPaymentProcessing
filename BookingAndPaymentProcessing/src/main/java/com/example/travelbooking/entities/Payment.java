package com.example.travelbooking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;


@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentID;

    @NotNull
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @NotNull
    private double amount;

    @NotNull
    private String status;

    @NotNull
    private String paymentMethod;

    // Getters and Setters
}
