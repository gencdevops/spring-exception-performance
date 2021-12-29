package com.example.globalexceptionhandling.repository;

import com.example.globalexceptionhandling.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
