package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Sauce {
    private static final long serialVersionUID = 1L;
    @Id
    @Resource
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Resource
    @Column(nullable = false)
    private String name;

    @Resource
    @Column(nullable = false)
    private float price;

    @Resource
    private String description;
}
