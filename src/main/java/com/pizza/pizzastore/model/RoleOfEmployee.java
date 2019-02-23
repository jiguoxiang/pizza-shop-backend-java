package com.pizza.pizzastore.model;

import javax.persistence.*;

@Entity
@IdClass(RoleOfEmployeeId.class)
public class RoleOfEmployee {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(nullable = false)
    private Long employeeId;
    @Id
    @Column(nullable = false)
    private Long roleId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public RoleOfEmployee(Long employeeId, Long roleId) {
        this.employeeId = employeeId;
        this.roleId = roleId;
    }
}
