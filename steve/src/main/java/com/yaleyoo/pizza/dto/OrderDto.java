package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDto {
    private long id;
    private LocalDate createTime;
    private LocalDate lastUpdateTime;
    private OrderStatus status;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    private String country;
    private String name;
    private String phoneNumber;
    private StoreDto store;
    private int total;
    private VoucherDto voucher;
    private List<OrderItemDto> orderItemList;

    public OrderDto(Order order){
        this.id = order.getId();
        this.createTime = order.getCreateTime();
        this.lastUpdateTime = order.getLastUpdateTime();
        this.status = order.getStatus();
        this.addressLine1 = order.getAddressLine1();
        this.addressLine2 = order.getAddressLine2();
        this.postcode = order.getPostcode();
        this.state = order.getState();
        this.country = order.getCountry();
        this.name = order.getName();
        this.phoneNumber = order.getPhoneNumber();
        this.store = new StoreDto(order.getStore());
        this.total = order.getTotal();
        this.voucher = new VoucherDto(order.getVoucher());
        this.orderItemList = order.getOrderItemList().stream().map(OrderItemDto::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDate getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDate lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StoreDto getStore() {
        return store;
    }

    public void setStore(StoreDto store) {
        this.store = store;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public VoucherDto getVoucher() {
        return voucher;
    }

    public void setVoucher(VoucherDto voucher) {
        this.voucher = voucher;
    }

    public List<OrderItemDto> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDto> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
