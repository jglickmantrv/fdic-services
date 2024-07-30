package com.nrv.fdic.ejbs;

import com.nrv.fdic.dtos.Customer;

public interface CustomerLocal {
    void save(Customer customer);
}
