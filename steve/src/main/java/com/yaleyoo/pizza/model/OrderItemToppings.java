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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getToppingId() {
        return toppingId;
    }

    public void setToppingId(long toppingId) {
        this.toppingId = toppingId;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(int toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
