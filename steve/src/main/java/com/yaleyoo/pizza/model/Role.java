package com.yaleyoo.pizza.model;


import javax.annotation.Resource;
import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String role;

    @ManyToMany(mappedBy = "roleList", fetch = FetchType.LAZY)
    private List<Staff> staffList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
