package com.patrick.PizzaOrder.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cheese extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
}
