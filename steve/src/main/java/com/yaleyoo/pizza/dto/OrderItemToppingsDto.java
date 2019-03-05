package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.OrderItemToppings;

/**
 * Created by steve on 5/3/19.
 */
public class OrderItemToppingsDto {
    private long id;
    private long toppingId;
    private int toppingPrice;
    private int quantity;
    private int subtotal;

    public OrderItemToppingsDto(OrderItemToppings orderItemToppings){
        this.id = orderItemToppings.getId();
        this.toppingId = orderItemToppings.getToppingId();
        this.toppingPrice = orderItemToppings.getToppingPrice();
        this.quantity = orderItemToppings.getQuantity();
        this.subtotal = orderItemToppings.getSubtotal();
    }

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
