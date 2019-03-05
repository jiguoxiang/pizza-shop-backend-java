package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Voucher;

import java.time.LocalDate;

/**
 * Created by steve on 5/3/19.
 */
public class VoucherDto {
    private long id;
    private boolean used;
    private LocalDate validateDate;

    public VoucherDto(Voucher voucher){
        this.id = voucher.getId();
        this.used = voucher.isUsed();
        this.validateDate = voucher.getValidateDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public LocalDate getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(LocalDate validateDate) {
        this.validateDate = validateDate;
    }
}
