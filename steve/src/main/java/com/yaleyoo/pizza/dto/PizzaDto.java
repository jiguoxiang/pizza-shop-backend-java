package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.model.PizzaSize;
import com.yaleyoo.pizza.model.PizzaToppings;
import com.yaleyoo.pizza.model.Sauce;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PizzaDto {
    private long id;
    private String name;
    private PizzaSize[] pizzaSizes;
    private String description;
    private SauceDto sauce;
    private Map<PizzaSize, Integer> unitPrice;
    private List<PizzaToppingsDto> toppingsList;

  public PizzaDto(Pizza pizza) {
    this.id = pizza.getId();
    this.name = pizza.getName();
    this.pizzaSizes = PizzaSize.values();
    this.description = pizza.getDescription();
    this.sauce = new SauceDto(pizza.getSauce());
    this.toppingsList = pizza.getToppingsList().stream().map(PizzaToppingsDto::new).collect(Collectors.toList());
    this.unitPrice = pizza.getPizzaUnitPrice();
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

    public PizzaSize[] getPizzaSizes() {
        return pizzaSizes;
    }

    public void setPizzaSizes(PizzaSize[] pizzaSizes) {
        this.pizzaSizes = pizzaSizes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SauceDto getSauce() {
        return sauce;
    }

    public void setSauce(SauceDto sauce) {
        this.sauce = sauce;
    }

    public List<PizzaToppingsDto> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<PizzaToppingsDto> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public Map<PizzaSize, Integer> getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Map<PizzaSize, Integer> unitPrice) {
        this.unitPrice = unitPrice;
    }
}
