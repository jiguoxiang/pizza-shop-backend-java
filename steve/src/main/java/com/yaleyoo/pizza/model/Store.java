package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Store {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String addressLine1;

    @Column
    private String addressLine2;

    @Column(nullable = false)
    private String postcode;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String country;
}
