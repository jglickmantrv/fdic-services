package com.nrv.fdic.domain.entities;

import com.nrv.fdic.dtos.Customer;
import com.nrv.fdic.dtos.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
//@Table(name = "CUSTOMERS")
@Data
public class Customers implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = AUTO)
	private Long id;

	@Column(name="NAME")
	private String name;

	@OneToMany(mappedBy = "customer", cascade = { CascadeType.ALL },
			orphanRemoval = true)
	private List<Orders> orders;

	public Customers() {
		super();
	}

	public Customers(Customer customer) {
		this.id=customer.getCustomerId();
		this.name=customer.getName();
		orders = new ArrayList<>();
		for (Order order : customer.getMockOrders()) {
			Orders orderEntity = new Orders();
			orderEntity.setName(order.getName());
			orderEntity.setCustomer(this);
			orderEntity.setId(order.getOrderId());
			orders.add(orderEntity);
		}
		this.setOrders(orders);
	}

}