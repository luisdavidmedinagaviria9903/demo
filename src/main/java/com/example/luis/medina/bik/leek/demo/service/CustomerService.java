package com.example.luis.medina.bik.leek.demo.service;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    Customer findByDocument(String document);
    Customer save(Customer customer);
    Page<Customer> findAllCustomer(Pageable pageable);

}
