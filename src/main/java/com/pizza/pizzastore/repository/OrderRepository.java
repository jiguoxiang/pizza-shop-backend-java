package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
