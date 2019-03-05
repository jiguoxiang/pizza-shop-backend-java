package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
