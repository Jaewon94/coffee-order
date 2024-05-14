package com.jaewon.coffeeorder.service;

import com.jaewon.coffeeorder.domain.CreateOrder;
import com.jaewon.coffeeorder.domain.Order;
import com.jaewon.coffeeorder.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void newOrder(CreateOrder createOrder) {
        Order entity = Order.newOrder(createOrder);
        orderRepository.save(entity);
    }
}
