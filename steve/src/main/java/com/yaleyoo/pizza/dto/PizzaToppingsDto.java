package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.PizzaToppings;

/**
 * Created by steve on 5/3/19.
 */
public class PizzaToppingsDto {
    private long id;
    private ToppingDto topping;
    private int quantity;

    public PizzaToppingsDto(PizzaToppings pizzaToppings){
        this.id = pizzaToppings.getId();
        this.topping = new ToppingDto(pizzaToppings.getTopping());
        this.quantity = pizzaToppings.getQuantity();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ToppingDto getTopping() {
        return topping;
    }

    public void setTopping(ToppingDto topping) {
        this.topping = topping;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
