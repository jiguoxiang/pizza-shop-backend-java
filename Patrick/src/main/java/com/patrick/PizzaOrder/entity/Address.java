package com.patrick.PizzaOrder.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String addressLineOne;
    @Column(nullable = false)
    private String addressLineTwo;
    @Column(nullable = false)
    private String postcode;
}
