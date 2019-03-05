package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Payment {
    private static final long serialVersionUID = 1L;
    @Id
    @Resource
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Resource
    @Column(nullable = false)
    private long orderId;

    @Resource
    @Column(nullable = false, unique = true)
    private String transactionId;
}
