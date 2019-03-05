package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Topping;

/**
 * Created by steve on 5/3/19.
 */
public class ToppingDto {
    private long id;
    private String name;
    private int price;

    public ToppingDto(Topping topping){
        this.id = topping.getId();
        this.name = topping.getName();
        this.price = topping.getPrice();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
