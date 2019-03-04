package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Entity
public class Pizza {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private PizzaSize pizzaSize;

    @OneToOne
    @JoinColumn(name = "sauce_id", referencedColumnName = "id")
    private Sauce sauce;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private String description;

    @OneToMany
    @JoinColumn(name = "pizza_id", referencedColumnName = "id")
    private List<PizzaToppings> toppingsList;
}
