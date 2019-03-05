package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long>{
}
