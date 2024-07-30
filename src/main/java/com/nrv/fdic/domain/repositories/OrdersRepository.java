package com.nrv.fdic.domain.repositories;

import com.nrv.fdic.domain.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository
        extends CrudRepository<Orders, Long>
{
}
