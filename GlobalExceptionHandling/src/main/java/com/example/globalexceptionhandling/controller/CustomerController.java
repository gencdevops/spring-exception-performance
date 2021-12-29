package com.example.globalexceptionhandling.controller;



import com.example.globalexceptionhandling.model.Customer;
import com.example.globalexceptionhandling.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable @Valid Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }


        return  customerService.findCustomerById(id);
    }

}
