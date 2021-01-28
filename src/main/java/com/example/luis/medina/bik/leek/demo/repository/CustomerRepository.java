package com.example.luis.medina.bik.leek.demo.repository;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByDocument(String document);

}
