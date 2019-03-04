package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Payment {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "order_id", unique = true, referencedColumnName = "id")
    private Order order;

    @Column(nullable = false, unique = true)
    private String transactionId;
}
