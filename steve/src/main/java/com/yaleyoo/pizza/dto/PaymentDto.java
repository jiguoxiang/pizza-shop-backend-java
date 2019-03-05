package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Payment;

/**
 * Created by steve on 5/3/19.
 */
public class PaymentDto {
    private long id;
    private long orderId;
    private String transactionId;

    public PaymentDto(Payment payment){
        this.id = payment.getId();
        this.orderId = payment.getOrder().getId();
        this.transactionId = payment.getTransactionId();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
