package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Entity
public class Staff {
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
    private String address;

    @Resource
    @Column(nullable = false)
    private long phoneNumber;

    @ManyToMany
    private List<Role> roleList;
}
