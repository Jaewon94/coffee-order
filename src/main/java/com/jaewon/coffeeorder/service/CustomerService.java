package com.jaewon.coffeeorder.service;

import com.jaewon.coffeeorder.domain.CreateCustomer;
import com.jaewon.coffeeorder.domain.Customer;
import com.jaewon.coffeeorder.domain.CustomerDto;
import com.jaewon.coffeeorder.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    public CustomerDto newCustomer(CreateCustomer customer) {
        Customer entity = Customer.newCustomer(customer);

        Customer saved = customerRepository.save(entity);

        return CustomerDto.builder()
                .address(saved.getAddress())
                .name(saved.getName())
                .phoneNumber(saved.getPhoneNumber())
                .build();
    }
}
