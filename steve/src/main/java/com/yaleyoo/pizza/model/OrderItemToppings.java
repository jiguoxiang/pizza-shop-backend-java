package com.yaleyoo.pizza.model;

import javax.persistence.*;

@Entity
public class OrderItemToppings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private long toppingId;

    @Column(nullable = false)
    private int toppingPrice;

    @Column(nullable = false)
    private int quantity;

    @Transient
    private int subtotal;
}
