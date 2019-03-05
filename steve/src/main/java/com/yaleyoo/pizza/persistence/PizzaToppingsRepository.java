package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.PizzaToppings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaToppingsRepository extends JpaRepository<PizzaToppings, Long>{
}
