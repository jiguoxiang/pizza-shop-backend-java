package com.patrick.PizzaOrder.service;

import com.patrick.PizzaOrder.dto.PizzaDto;
import com.patrick.PizzaOrder.entity.Pizza;
import com.patrick.PizzaOrder.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository repo;

    public List<PizzaDto> listPizza() {
        List<Pizza> pizzas = repo.findAll();
        return pizzas.stream().map(i -> new PizzaDto(i)).collect(Collectors.toList());
    }

/*    public List<Pizza> listPizza() {
        List<Pizza> pizzas = repo.findAll();
        return pizzas;
    }*/
}
