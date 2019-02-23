package com.pizza.pizzastore.model;

import javax.persistence.*;

@Entity
public class Pizza {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Long baseTypeId;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SauceType sauce;
    @Column(nullable = false)
    private Double price;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBaseTypeId() {
        return baseTypeId;
    }

    public void setBaseTypeId(Long baseTypeId) {
        this.baseTypeId = baseTypeId;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public void setSauce(SauceType sauce) {
        this.sauce = sauce;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Pizza(Long baseTypeId, SauceType sauce, Double price) {
        this.baseTypeId = baseTypeId;
        this.sauce = sauce;
        this.price = price;
    }
}
