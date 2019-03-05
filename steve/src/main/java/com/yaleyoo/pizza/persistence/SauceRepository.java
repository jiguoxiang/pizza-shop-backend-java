package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Sauce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SauceRepository extends JpaRepository<Sauce, Long>{
}
