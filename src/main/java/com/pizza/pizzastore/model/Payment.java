package com.pizza.pizzastore.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String transicationMethod;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransicationMethod() {
        return transicationMethod;
    }

    public void setTransicationMethod(String transicationMethod) {
        this.transicationMethod = transicationMethod;
    }

    public Payment(String transicationMethod) {
        this.transicationMethod = transicationMethod;
    }

    public Payment(){

    }
}
