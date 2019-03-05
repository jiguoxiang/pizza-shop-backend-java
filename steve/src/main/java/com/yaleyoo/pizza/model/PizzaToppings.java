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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
