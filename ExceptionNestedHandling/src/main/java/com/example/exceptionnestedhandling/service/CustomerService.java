package com.example.exceptionnestedhandling.service;


import com.example.exceptionnestedhandling.exception.CustomerNotFoundException;
import com.example.exceptionnestedhandling.model.Customer;
import com.example.exceptionnestedhandling.repository.CustomerRepository;
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
                        () -> new CustomerNotFoundException("No such customer"));
    }

}
