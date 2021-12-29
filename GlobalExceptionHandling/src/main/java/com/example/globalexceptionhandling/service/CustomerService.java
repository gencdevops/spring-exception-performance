package com.example.globalexceptionhandling.service;

import com.example.globalexceptionhandling.exception.CustomerNotFoundException;
import com.example.globalexceptionhandling.model.Customer;
import com.example.globalexceptionhandling.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(
                        () -> new CustomerNotFoundException("Customer could not find by id: " + id));
    }

}
