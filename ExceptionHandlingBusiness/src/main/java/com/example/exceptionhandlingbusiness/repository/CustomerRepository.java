package com.example.exceptionhandlingbusiness.repository;


import com.example.exceptionhandlingbusiness.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
