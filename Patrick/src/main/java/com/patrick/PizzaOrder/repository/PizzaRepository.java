package com.patrick.PizzaOrder.repository;

import com.patrick.PizzaOrder.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
