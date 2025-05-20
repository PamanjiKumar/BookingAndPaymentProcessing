package com.example.travelbooking.entities;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingID;

    @NotNull
    @ManyToOne
    private Customer customer;

    @NotNull
    @ManyToOne
    private TravelPackage travelPackage;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    @NotNull
    private String status;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL)
    private Payment payment;

    // Getters and Setters
}
