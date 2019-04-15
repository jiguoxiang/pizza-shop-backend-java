package com.yaleyoo.pizza.controller;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by steve on 7/3/19.
 */
@RestController
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @RequestMapping("/ad321123")
    public List<Pizza> pizzas(){
        //aaaaaaaqweqweqwe123
        /////123123213123
        return pizzaService.getAllPizza();
    }
}
