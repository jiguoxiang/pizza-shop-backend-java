package com.yaleyoo.pizza.config;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.model.PizzaSize;
import com.yaleyoo.pizza.model.Sauce;
import com.yaleyoo.pizza.persistence.PizzaRepository;
import com.yaleyoo.pizza.persistence.SauceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
    boolean alreadySetup = false;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private SauceRepository sauceRepository;

    @Autowired
    @Qualifier("passwordEncoder")
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup) {
            return;
        }
        Sauce sauce = new Sauce();
        sauce.setId(1);
        sauce.setDescription("white");
        sauce.setName("white");
        sauce.setPrice(100);

        Pizza pizza = new Pizza();
        pizza.setId(1);
        pizza.setDescription("hawaii");
        pizza.setName("hawaii");
        pizza.setPizzaSizes(PizzaSize.values());
        pizza.setPrice(1200);
        pizza.setSauce(sauce);

        sauceRepository.save(sauce);
        pizzaRepository.save(pizza);

        alreadySetup = true;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }
}
