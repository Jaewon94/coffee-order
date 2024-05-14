package com.jaewon.coffeeorder.controller;

import com.jaewon.coffeeorder.domain.CreateOrder;
import com.jaewon.coffeeorder.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/api/v1/orders")
    public Response<Void> newOrder(){
        HashMap<Integer, Integer> orderMap = new HashMap<>();
        orderMap.put(1, 5);
        orderMap.put(2, 10);

        orderService.newOrder(CreateOrder.builder()
                .customerId(1)
                .quantityByProduct(orderMap)
                .build());

        return Response.success(null);
    }
}
