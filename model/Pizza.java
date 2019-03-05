package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pizza {
    // Pizza includes dough, sauce, and price.
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    private PizzaSize

    private sauce?
    @Column(nullable = false)
    private float price;

    private String description;
}
