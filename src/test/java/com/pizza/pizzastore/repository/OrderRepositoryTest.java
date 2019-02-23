package com.pizza.pizzastore.repository;

import com.pizza.pizzastore.model.Order;
import com.pizza.pizzastore.model.OrderStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderRepositoryTest {
    @Resource
    private OrderRepository orderRepository;


    @Before
    public void setUp(){
        orderRepository.deleteAll();

    }

    @Test
    public void testOrderInfo(){
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        Date date1 = new Date();
        Timestamp ts1 = new Timestamp(date1.getTime());
        orderRepository.save(new Order(ts,ts1, OrderStatus.DELIVERED,20.3,"sddsdds","0343435",(long)12131,(long)3434));



    }
}
