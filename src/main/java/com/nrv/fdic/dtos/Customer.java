package com.nrv.fdic.dtos;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private String name;
    private String id;
    private Long customerId;
    private List<Order> mockOrders;
}
