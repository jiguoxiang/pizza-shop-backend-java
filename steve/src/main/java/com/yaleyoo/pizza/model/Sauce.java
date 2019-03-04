package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Sauce {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String description;
}
