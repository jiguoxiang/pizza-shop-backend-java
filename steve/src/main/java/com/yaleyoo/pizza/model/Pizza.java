package com.yaleyoo.pizza.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Transient
    private PizzaSize[] pizzaSizes;

    @ManyToOne
    @JoinColumn(name = "sauce_id", referencedColumnName = "id")
    private Sauce sauce;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String description;

    @OneToMany
    @JoinColumn(name = "pizza_id", referencedColumnName = "id")
    private List<PizzaToppings> toppingsList;

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

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
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

    public List<PizzaToppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<PizzaToppings> toppingsList) {
        this.toppingsList = toppingsList;
    }
}
