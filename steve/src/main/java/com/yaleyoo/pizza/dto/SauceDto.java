package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Sauce;

public class SauceDto {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private int price;
    private String description;

    public SauceDto(Sauce sauce){
        this.id = sauce.getId();
        this.name = sauce.getName();
        this.price = sauce.getPrice();
        this.description = sauce.getDescription();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
