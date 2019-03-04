package com.yaleyoo.pizza.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Entity
public class OrderItem {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private long pizzaId;

    @Column(nullable = false)
    private int pizzaPrice;

    @Transient
    private int subtotal;

    @Column(nullable = false)
    private int pizzaQty;

    @OneToMany
    @JoinColumn(name = "order_item_id", referencedColumnName = "id")
    private List<OrderItemToppings> orerItemToppingList;

}
