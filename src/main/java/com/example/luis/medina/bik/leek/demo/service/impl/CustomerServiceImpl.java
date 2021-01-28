package com.example.luis.medina.bik.leek.demo.service.impl;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.repository.CustomerRepository;
import com.example.luis.medina.bik.leek.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findByDocument(String document) {
        return customerRepository.findByDocument(document);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

}
