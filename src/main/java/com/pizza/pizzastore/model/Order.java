package com.pizza.pizzastore.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Order {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private Timestamp creatTime;
    @Column(nullable = false)
    private Timestamp lastUpdateTime;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;
    @Column(nullable = true)
    private Double voucher;
    @Column(nullable = true)
    private String address;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private Long storeId;
    @Column(nullable = true)
    private Long transicationId;

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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Double getVoucher() {
        return voucher;
    }

    public void setVoucher(Double voucher) {
        this.voucher = voucher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getTransicationId() {
        return transicationId;
    }

    public void setTransicationId(Long transicationId) {
        this.transicationId = transicationId;
    }

    public Order(Timestamp creatTime, Timestamp lastUpdateTime, OrderStatus orderStatus, Double voucher, String address, String phoneNumber, Long storeId, Long transicationId) {
        this.creatTime = creatTime;
        this.lastUpdateTime = lastUpdateTime;
        this.status = orderStatus;
        this.voucher = voucher;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.storeId = storeId;
        this.transicationId = transicationId;
    }

    public Order(){

    }
}
