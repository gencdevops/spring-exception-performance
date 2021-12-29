package com.example.exceptionnestedhandling.repository;

import com.example.exceptionnestedhandling.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
