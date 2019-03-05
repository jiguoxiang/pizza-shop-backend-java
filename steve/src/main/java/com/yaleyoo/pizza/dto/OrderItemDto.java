package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.OrderItem;
import com.yaleyoo.pizza.model.PizzaSize;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by steve on 5/3/19.
 */
public class OrderItemDto {
    private long id;
    private long orderId;
    private long pizzaId;
    private int pizzaPrice;
    private PizzaSize pizzaSize;
    private int subtotal;
    private int pizzaQty;
    private List<OrderItemToppingsDto> orderItemToppingDtoList;

    public OrderItemDto(OrderItem orderItem){
        this.id = orderItem.getId();
        this.orderId = orderItem.getOrder().getId();
        this.pizzaId = orderItem.getPizzaId();
        this.pizzaPrice = orderItem.getPizzaPrice();
        this.pizzaSize = orderItem.getPizzaSize();
        this.subtotal = orderItem.getSubtotal();
        this.pizzaQty = orderItem.getPizzaQty();
        this.orderItemToppingDtoList = orderItem.getOrerItemToppingList().stream()
                .map(OrderItemToppingsDto::new).collect(Collectors.toList());
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

    public long getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getPizzaQty() {
        return pizzaQty;
    }

    public void setPizzaQty(int pizzaQty) {
        this.pizzaQty = pizzaQty;
    }

    public List<OrderItemToppingsDto> getOrderItemToppingDtoList() {
        return orderItemToppingDtoList;
    }

    public void setOrderItemToppingDtoList(List<OrderItemToppingsDto> orderItemToppingDtoList) {
        this.orderItemToppingDtoList = orderItemToppingDtoList;
    }
}
