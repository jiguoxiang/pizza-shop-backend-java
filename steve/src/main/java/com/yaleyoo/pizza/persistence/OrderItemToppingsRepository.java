package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.OrderItemToppings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemToppingsRepository extends JpaRepository<OrderItemToppings, Long>{
}
