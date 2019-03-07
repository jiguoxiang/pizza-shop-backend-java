package com.yaleyoo.pizza.model;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "sauce_id", referencedColumnName = "id")
    private Sauce sauce;

    @OneToMany
    @JoinColumn(name = "pizza_id")
    private List<PizzaSizePrice> pizzaSizePrices;

    @Column(nullable = false)
    private String description;

    @OneToMany
    @JoinColumn(name = "pizza_id", referencedColumnName = "id")
    private List<PizzaToppings> toppingsList;

    @Transient
    private Map<PizzaSize, Integer> pizzaUnitPrice;

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

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PizzaToppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<PizzaToppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public List<PizzaSizePrice> getPizzaSizePrices() {
        return pizzaSizePrices;
    }

    public void setPizzaSizePrices(List<PizzaSizePrice> pizzaSizePrices) {
        this.pizzaSizePrices = pizzaSizePrices;
    }

    public Map<PizzaSize, Integer> getPizzaUnitPrice() {
        this.pizzaUnitPrice = new HashMap<>();
        this.pizzaSizePrices.forEach(sizedPizza -> {
            int unitPrice = this.sauce.getPrice() + sizedPizza.getPrice();
            for (PizzaToppings topping : toppingsList) unitPrice += topping.getTopping().getPrice();

            this.pizzaUnitPrice.put(sizedPizza.getPizzaSize(), unitPrice);
        });
        return pizzaUnitPrice;
    }
}
