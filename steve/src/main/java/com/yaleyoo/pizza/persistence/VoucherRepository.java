package com.yaleyoo.pizza.persistence;

import com.yaleyoo.pizza.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepository extends JpaRepository<Voucher, Long>{
}
