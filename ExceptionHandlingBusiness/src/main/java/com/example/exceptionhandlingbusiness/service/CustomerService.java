package com.example.exceptionhandlingbusiness.service;

import com.example.exceptionhandlingbusiness.model.Customer;
import com.example.exceptionhandlingbusiness.repository.CustomerRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(new Customer());

    }
}
