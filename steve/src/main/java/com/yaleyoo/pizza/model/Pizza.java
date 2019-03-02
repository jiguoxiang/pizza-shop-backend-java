package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pizza {
    private static final long serialVersionUID = 1L;
    @Id
    @Resource
    @GeneratedValue(strategy=GenerationType.AUTO)
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
