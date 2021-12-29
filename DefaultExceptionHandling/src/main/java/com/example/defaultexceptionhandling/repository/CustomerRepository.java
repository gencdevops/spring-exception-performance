package com.example.defaultexceptionhandling.repository;

import com.example.defaultexceptionhandling.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
