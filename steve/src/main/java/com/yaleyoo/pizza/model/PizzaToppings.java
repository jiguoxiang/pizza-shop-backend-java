package com.yaleyoo.pizza.model;

import javax.persistence.*;

@Entity
public class PizzaToppings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "topping_id", referencedColumnName = "id")
    private Topping topping;

    @Column(nullable = false)
    private int quantity;
}
