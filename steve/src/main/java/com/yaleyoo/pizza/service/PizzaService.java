package com.yaleyoo.pizza.service;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.persistence.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by steve on 7/3/19.
 */

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizza(){
        return pizzaRepository.findAll();
    }
}
