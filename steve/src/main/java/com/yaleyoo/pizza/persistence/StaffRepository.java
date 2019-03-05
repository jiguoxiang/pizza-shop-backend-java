package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long>{
}
