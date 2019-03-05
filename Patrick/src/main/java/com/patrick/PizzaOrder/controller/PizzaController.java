package com.patrick.PizzaOrder.controller;

import com.patrick.PizzaOrder.dto.PizzaDto;
import com.patrick.PizzaOrder.entity.Pizza;
import com.patrick.PizzaOrder.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public List<PizzaDto> listPizzas() {
        return pizzaService.listPizza();
    }


}
