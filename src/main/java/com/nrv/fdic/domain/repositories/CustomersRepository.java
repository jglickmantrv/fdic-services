package com.nrv.fdic.domain.repositories;

import com.nrv.fdic.domain.entities.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository
        extends CrudRepository<Customers, Long>
{
}
