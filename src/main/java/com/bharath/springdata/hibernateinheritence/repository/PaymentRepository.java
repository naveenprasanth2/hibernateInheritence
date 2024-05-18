package com.bharath.springdata.hibernateinheritence.repository;

import com.bharath.springdata.hibernateinheritence.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
