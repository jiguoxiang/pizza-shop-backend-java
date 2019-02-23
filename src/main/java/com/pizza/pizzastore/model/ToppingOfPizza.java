package com.pizza.pizzastore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ToppingOfPizzaId.class)
public class ToppingOfPizza {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private Long toppingId;
    @Id
    @Column(nullable = false)
    private Long baseId;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Double price;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getToppingId() {
        return toppingId;
    }

    public void setToppingId(Long toppingId) {
        this.toppingId = toppingId;
    }

    public Long getBaseId() {
        return baseId;
    }

    public void setBaseId(Long baseId) {
        this.baseId = baseId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ToppingOfPizza(Long toppingId, Long baseId, Integer quantity, Double price) {
        this.toppingId = toppingId;
        this.baseId = baseId;
        this.quantity = quantity;
        this.price = price;
    }

    public ToppingOfPizza() {

    }
}
