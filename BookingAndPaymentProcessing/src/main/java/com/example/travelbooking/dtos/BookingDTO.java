package com.example.travelbooking.dtos;

import jakarta.validation.constraints.NotNull;
import java.util.Date;

public class BookingDTO {
    @NotNull
    private Long customerID;

    @NotNull
    private Long travelPackageID;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    // Getters and Setters
}
