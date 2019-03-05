package com.patrick.PizzaOrder.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private int quantity;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pizza_id", nullable = false)
    private Pizza pizza;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "changed_crust_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Crust changedCrust;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "changed_cheese_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Cheese changedCheese;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "changed_sauce_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Sauce changedSauce;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderItem")
    private List<OrderItemToppings> changedToppingList;
    private String remark;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Order order;
    private int changedCrustPrice;
    private int changedCheesePrice;
    private int changedToppingPrice;
    private int pizzaPrice;

    public double getSingleOrderItemPrice() {
        return pizza.getPrice() + getChangedCrustPrice() + getChangedCheesePrice() + getToppingPrice();
    }

    public double getChangedCrustPrice() {
        double changedCrustPrice = Optional.ofNullable(changedCrust).map(crust -> crust.getPrice()).orElse(0);
        double gap = changedCrustPrice - pizza.getCrust().getPrice();
        double actualCrustCost = gap > 0 ? gap : 0;
        return actualCrustCost;
    }

    public double getChangedCheesePrice() {
        double changedCheesePrice = Optional.ofNullable(changedCheese).map(cheese -> cheese.getPrice()).orElse(0);
        return changedCheesePrice;
    }

    public double getToppingPrice() {
/*        DoubleSummaryStatistics defaultToppingStat = pizza.getToppingList().stream().mapToDouble((topping) -> topping.getPrice()).summaryStatistics();
        double defaultToppingTotalCost = defaultToppingStat.getSum();
        DoubleSummaryStatistics changedToppingStat = changedToppingList.stream().mapToDouble((topping) -> topping.getPrice()).summaryStatistics();
        double changedToppingTotalCost = changedToppingStat.getSum();
        double gap = changedToppingTotalCost - defaultToppingTotalCost;
        double actualToppingCost = gap > 0 ? gap : 0;
        return actualToppingCost;*/
        return 0;
    }
}
