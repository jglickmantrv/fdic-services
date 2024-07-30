package com.nrv.fdic.dtos;

import lombok.Data;

@Data
public class Order {
    private Long orderId;
    private Long customerId;
    private String name;
}
