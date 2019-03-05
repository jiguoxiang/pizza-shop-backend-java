package com.yaleyoo.pizza.model;

import javax.annotation.Resource;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Voucher {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private boolean used;

    @Column(nullable = false)
    private Date validateDate;

}
