package com.yaleyoo.pizza.model;


import javax.annotation.Resource;
import javax.persistence.*;

@Entity
public class Role {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String role;
}
