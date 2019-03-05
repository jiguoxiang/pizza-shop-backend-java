package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Store;

public class StoreDto {
    private static final long serialVersionUID = 1L;

    private long id;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    private String country;

    public StoreDto(Store store){
        this.id = store.getId();
        this.addressLine1 = store.getAddressLine1();
        this.addressLine2 = store.getAddressLine2();
        this.postcode = store.getPostcode();
        this.state = store.getState();
        this.country = store.getCountry();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
