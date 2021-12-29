package com.example.defaultexceptionhandling.service;

import com.example.defaultexceptionhandling.model.Customer;
import com.example.defaultexceptionhandling.repository.CustomerRepository;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).get();

    }
}
