package com.patrick.PizzaOrder.entity;

import com.patrick.PizzaOrder.dto.PizzaToppingDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sauce_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Sauce sauce;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "crust_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Crust crust;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cheese_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Cheese cheese;
    @Column(nullable = false)
    private int price;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pizza")
    private List<PizzaTopping> pizzaToppings;

}
