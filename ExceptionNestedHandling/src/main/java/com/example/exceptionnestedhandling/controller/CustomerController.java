package com.example.exceptionnestedhandling.controller;



import com.example.exceptionnestedhandling.exception.ResponseApi;
import com.example.exceptionnestedhandling.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Map;


@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseApi> findCustomerById(@PathVariable @Valid Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }


      return  ResponseEntity.ok(
                new ResponseApi.ResponseBuilder()
                        .TimeStamp(LocalDateTime.now())
                        .Message("foud customer:" + id)
                        .StatusCode(200)
                        .HttpStatus(HttpStatus.ACCEPTED)
                        .Data(Map.of("customer", customerService.findCustomerById(id)))
                        .build()
        );
    }
}