package com.yaleyoo.pizza.model;

import javax.persistence.*;

/**
 * Created by steve on 6/3/19.
 */
@Entity
public class PizzaSizePrice {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

    @Column(nullable = false)
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
