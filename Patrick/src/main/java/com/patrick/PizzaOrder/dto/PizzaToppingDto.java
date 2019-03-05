package com.patrick.PizzaOrder.dto;

import com.patrick.PizzaOrder.entity.PizzaTopping;
import lombok.Data;

import java.io.Serializable;

@Data
public class PizzaToppingDto implements Serializable {
    private long id;
    private String topping;
    private int quantity;

    public PizzaToppingDto(PizzaTopping pizzaTopping) {
        this.id = pizzaTopping.getId();
        this.topping = pizzaTopping.getTopping().getName();
        this.quantity = pizzaTopping.getQuantity();
    }
}
