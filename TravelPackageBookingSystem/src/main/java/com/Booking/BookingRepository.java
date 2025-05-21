package com.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository: BookingRepository 
public interface BookingRepository extends JpaRepository<Booking, Long> {}