package com.patrick.PizzaOrder.entity;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Data
public class PizzaTopping extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pizza_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pizza pizza;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "topping_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Topping topping;
    @Min(3)
    private int quantity;
}
