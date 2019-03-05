package com.yaleyoo.pizza.dto;

import com.yaleyoo.pizza.model.Role;

public class RoleDto {
    private long id;
    private String role;

    public RoleDto(Role role) {
        this.id = role.getId();
        this.role = role.getRole();
    }

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
}
