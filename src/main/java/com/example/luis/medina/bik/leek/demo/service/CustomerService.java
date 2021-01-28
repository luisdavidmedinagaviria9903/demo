package com.example.luis.medina.bik.leek.demo.service;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.security.acl.LastOwnerException;

public interface CustomerService {

    Customer findById(Long id);
    Customer save(Customer customer);
    Page<Customer> findAllCustomer(Pageable pageable);
    void deleteById(Long id);

}
