package com.nrv.fdic.controllers;

import com.nrv.fdic.dtos.Customer;
import com.nrv.fdic.ejbs.impl.CustomerEjb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200, https://main.d20vuuf91hyr1k.amplifyapp.com")
public class CustomerController {
    //todo: fix this
    //@EJB
    @Autowired
    private CustomerEjb customerEjb;

    @RequestMapping(method = RequestMethod.POST)
    public void postCustomer(@RequestBody Customer customer) {
        customerEjb.save(customer);
    }

    @PutMapping
    public void putCustomer(Customer customer) {
        customerEjb.save(customer);
    }

    @GetMapping()
    public Customer getCustomer(@RequestParam("id") Long id) {
        System.out.println("in getCustomer()");
        return customerEjb.findById(id);
    }
}
