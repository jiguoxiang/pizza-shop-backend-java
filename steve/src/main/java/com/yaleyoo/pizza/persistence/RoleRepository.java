package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
