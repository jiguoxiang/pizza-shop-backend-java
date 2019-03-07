package com.yaleyoo.pizza.config;

import com.yaleyoo.pizza.model.Pizza;
import com.yaleyoo.pizza.model.Sauce;
import com.yaleyoo.pizza.model.Voucher;
import com.yaleyoo.pizza.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {
    boolean alreadySetup = false;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private SauceRepository sauceRepository;

    @Autowired
    private VoucherRepository voucherRepository;

    @Autowired
    @Qualifier("passwordEncoder")
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup) {
            return;
        }
//        Sauce sauce = new Sauce();
//        sauce.setDescription("white");
//        sauce.setName("white");
//        sauce.setPrice(100);
//
//        Pizza pizza = new Pizza();
//        pizza.setDescription("hawaii");
//        pizza.setName("hawaii");
////        pizza.setPizzaSizes(PizzaSize.values());
////        pizza.setPrice(1200);
//        pizza.setSauce(sauce);
//
//        Voucher voucher = new Voucher();
//        voucher.setUsed(false);
//        voucher.setValidateDate(LocalDate.now());
//
//        voucherRepository.save(voucher);
//        sauceRepository.save(sauce);
//        pizzaRepository.save(pizza);

        alreadySetup = true;
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(11);
    }
}
