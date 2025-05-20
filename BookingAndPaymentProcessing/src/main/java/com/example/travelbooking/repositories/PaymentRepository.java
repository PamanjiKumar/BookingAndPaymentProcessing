package com.example.travelbooking.repositories;

import com.example.travelbooking.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
