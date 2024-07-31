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

	public Customer creatDto() {
		Customer customer = new Customer();
		customer.setCustomerId(this.id);
		customer.setName(this.name);
		customer.setMockOrders(new ArrayList<>());
		for (Orders orderEntity : this.getOrders()) {
			Order order = new Order();
			order.setOrderId(orderEntity.getId());
			order.setCustomerId(orderEntity.getId());
			order.setName(orderEntity.getName());
			customer.getMockOrders().add(order);
		}
		return customer;
	}

	public String toString() {
		return name;
	}

}