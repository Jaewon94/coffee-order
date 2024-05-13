package com.jaewon.coffeeorder.controller;

import com.jaewon.coffeeorder.domain.CreateCustomer;
import com.jaewon.coffeeorder.domain.Customer;
import com.jaewon.coffeeorder.domain.CustomerDto;
import com.jaewon.coffeeorder.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/api/v1/customers")
    public Response<CustomerDto> createCustomer(@RequestParam String name,
                                      @RequestParam String address,
                                      @RequestParam String phoneNumber) {
        return Response.success(customerService.newCustomer(
                CreateCustomer.builder()
                        .address(address)
                        .name(name)
                        .phoneNumber(phoneNumber)
                        .build()
                )
        );
    }
}
