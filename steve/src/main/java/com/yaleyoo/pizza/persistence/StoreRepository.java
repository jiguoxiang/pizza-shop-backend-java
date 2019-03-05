package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
