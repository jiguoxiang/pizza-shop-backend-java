package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long>{
}
