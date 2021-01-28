package com.example.luis.medina.bik.leek.demo.business;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerBusiness {

    Customer findByDocument(String document);
    Customer save(Customer customer);
    Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy);
}
