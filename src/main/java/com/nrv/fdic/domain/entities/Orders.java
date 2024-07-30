package com.nrv.fdic.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
//@Table(appliesTo = "ORDERS")//(name = "ORDERS")
@Data
public class Orders implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn
	private Customers customer;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = AUTO)
	private Long id;

	@Column(name="NAME")
	private String name;

}