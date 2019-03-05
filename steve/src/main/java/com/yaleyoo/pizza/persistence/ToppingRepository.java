package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long>{
}
