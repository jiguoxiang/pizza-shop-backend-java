package com.yaleyoo.pizza;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.persistence.PizzaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PizzaApplicationTests {
    @Autowired
    private PizzaRepository pizzaRepository;
	@Test
	public void contextLoads() {
	    List<Pizza> pizzaList = pizzaRepository.findAll();
        System.out.println("");
	}

}
