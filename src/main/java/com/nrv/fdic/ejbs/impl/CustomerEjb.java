package com.nrv.fdic.ejbs.impl;

import com.nrv.fdic.domain.entities.Customers;
import com.nrv.fdic.domain.repositories.CustomersRepository;
import com.nrv.fdic.dtos.Customer;
import com.nrv.fdic.ejbs.CustomerLocal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ejb.Stateless;

@Stateless
@Service
public class CustomerEjb implements CustomerLocal {
    @Autowired
    private CustomersRepository customersRepository;
    @Override
    public void save(Customer customer) {
        customersRepository.save(new Customers(customer));
    }
}
