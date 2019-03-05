package com.patrick.PizzaOrder.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Staff extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean enabled;
    private boolean tokenExpired;
    @JoinColumn(name = "test", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;
    @ManyToMany
    @JoinTable(name = "staff_roles", joinColumns = @JoinColumn(name = "staff_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
    @Column(nullable = false)
    private String mobileNumber;
}
