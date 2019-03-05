package com.patrick.PizzaOrder.repository;

import com.patrick.PizzaOrder.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Staff, Long> {
}