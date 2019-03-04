package com.yaleyoo.pizza.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.Resource;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "[order]")
public class Order {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    @CreatedDate
    private LocalDate createTime;

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDate lastUpdateTime;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private Store store;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private List<OrderItem> orderItemList;

    @Transient
    private int total;

    @OneToOne
    @JoinColumn(name = "voucher_id", referencedColumnName = "id")
    private Voucher voucher;
}
