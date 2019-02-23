package com.pizza.pizzastore.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class OrderItem {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Timestamp creatTime;
    @Column(nullable = false)
    private Timestamp lastUpdateTime;
    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Double itemPrice;
    @Column(nullable = false)
    private Long orderId;
    @Column(nullable = false)
    private Long pizzaId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public OrderItem(Timestamp creatTime, Timestamp lastUpdateTime, Integer quantity, Double itemPrice, Long orderId, Long pizzaId) {
        this.creatTime = creatTime;
        this.lastUpdateTime = lastUpdateTime;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.orderId = orderId;
        this.pizzaId = pizzaId;
    }

    public OrderItem(){

    }
}
