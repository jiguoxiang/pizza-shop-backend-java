package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
