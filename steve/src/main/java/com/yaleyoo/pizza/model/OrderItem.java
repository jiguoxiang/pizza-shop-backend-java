package com.yaleyoo.pizza.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column(nullable = false)
    private long pizzaId;

    @Column(nullable = false)
    private int pizzaPrice;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

    @Transient
    private int subtotal;

    @Column(nullable = false)
    private int pizzaQty;

    @OneToMany
    @JoinColumn(name = "order_item_id", referencedColumnName = "id")
    private List<OrderItemToppings> orerItemToppingList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

    public List<OrderItemToppings> getOrerItemToppingList() {
        return orerItemToppingList;
    }

    public void setOrerItemToppingList(List<OrderItemToppings> orerItemToppingList) {
        this.orerItemToppingList = orerItemToppingList;
    }
}
