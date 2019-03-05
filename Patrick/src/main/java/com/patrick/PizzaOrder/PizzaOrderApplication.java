package com.patrick.PizzaOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PizzaOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PizzaOrderApplication.class, args);
    }
}
