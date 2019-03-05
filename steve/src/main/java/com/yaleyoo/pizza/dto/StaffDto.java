package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Staff;
import com.yaleyoo.pizza.model.StaffStatus;

import java.time.LocalDate;

public class StaffDto {
    private static final long serialVersionUID = 1L;

    private long id;
    private LocalDate createTime;
    private LocalDate updateTime;
    private String username;
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    private String country;
    private String mobileNumber;
    private StaffStatus staffStatus;

    public StaffDto(Staff staff){
        this.id = staff.getId();
        this.createTime = staff.getCreateTime();
        this.updateTime = staff.getUpdateTime();
        this.username = staff.getUsername();
        this.password = staff.getPassword();
        this.lastName = staff.getLastName();
        this.firstName = staff.getFirstName();
        this.middleName = staff.getMiddleName();
        this.addressLine1 = staff.getAddressLine1();
        this.addressLine2 = staff.getAddressLine2();
        this.postcode = staff.getPostcode();
        this.state = staff.getState();
        this.country = staff.getCountry();
        this.mobileNumber = staff.getMobileNumber();
        this.staffStatus = staff.getStaffStatus();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public StaffStatus getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(StaffStatus staffStatus) {
        this.staffStatus = staffStatus;
    }
}
