package com.example.defaultexceptionhandling.controller;


import com.example.defaultexceptionhandling.model.Customer;
import com.example.defaultexceptionhandling.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable  Long id) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }


      return customerService.findById(id);
    }

}
