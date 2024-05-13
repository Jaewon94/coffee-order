package com.jaewon.coffeeorder.repository;

import com.jaewon.coffeeorder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
