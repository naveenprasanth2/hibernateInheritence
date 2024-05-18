package com.bharath.springdata.hibernateinheritence.repository;

import com.bharath.springdata.hibernateinheritence.entities.CreditCard;
import com.bharath.springdata.hibernateinheritence.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

    Optional<Payment> findByCardnumberGreaterThan(String number);
}
