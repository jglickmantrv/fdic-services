package com.nrv.fdic.repositories;

import com.nrv.FdicApplication;
import com.nrv.fdic.domain.entities.Customers;
import com.nrv.fdic.domain.entities.Orders;
import com.nrv.fdic.domain.repositories.CustomersRepository;
import com.nrv.fdic.dtos.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FdicApplication.class)
public class CustomersRepositoryTest {
    @Autowired
    CustomersRepository customersRepository;
    @Test
    public void saveTest() {
        Customers customer = new Customers();
        //customer.setId(1l);
        customer.setName("name1");
        List<Orders> orders = new ArrayList<>();
        Orders order = new Orders();
        order.setCustomer(customer);
        order.setName("order name 1");
        orders.add(order);
        customer.setOrders(orders);
        customersRepository.save(customer);
    }
}
