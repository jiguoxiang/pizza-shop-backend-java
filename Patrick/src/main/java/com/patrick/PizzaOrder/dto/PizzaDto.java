package com.patrick.PizzaOrder.dto;

import com.patrick.PizzaOrder.entity.Pizza;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PizzaDto implements Serializable {
    private int id;
    private String name;
    private String cheese;
    private String sauce;
    private String crust;
    private List<PizzaToppingDto> pizzaToppings = new ArrayList<>();

    public PizzaDto(Pizza pizza) {
        this.id = pizza.getId();
        this.name = pizza.getName();
        this.cheese = pizza.getCheese().getName();
        this.sauce = pizza.getSauce().getName();
        this.crust = pizza.getCrust().getName();
        this.pizzaToppings.addAll(pizza.getPizzaToppings().stream().map(i -> new PizzaToppingDto(i)).collect(Collectors.toList()));
    }

}
