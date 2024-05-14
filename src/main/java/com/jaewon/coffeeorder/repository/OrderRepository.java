package com.jaewon.coffeeorder.repository;

import com.jaewon.coffeeorder.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
