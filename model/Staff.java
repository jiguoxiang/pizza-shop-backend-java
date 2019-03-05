package com.yaleyoo.pizza.model;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Staff {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String username;
    private String password;

    private String lastName;
    private String firstName;
    private String middleName;

    @Column(nullable = false)
    private String address; //???
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    private String country;

    @Column(nullable = false)
    private String mobileNumber;//?? 040666677  006140666677  98787655 0398787655

    @ManyToMany
    private List<Role> roleList;

    private StaffStatus
    private LocalDate createTime;
    private LocalDate updateTime;
}
