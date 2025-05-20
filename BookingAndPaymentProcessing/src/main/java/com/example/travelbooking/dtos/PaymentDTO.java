package com.example.travelbooking.dtos;

import jakarta.validation.constraints.NotNull;

public class PaymentDTO {
    @NotNull
    private Long bookingID;

    @NotNull
    private double amount;

    @NotNull
    private String paymentMethod;

    // Getters and Setters
}
