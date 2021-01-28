package com.example.luis.medina.bik.leek.demo.business;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerBusiness {

    Customer findById(Long id);
    Customer save(Customer customer);
    void deleteById(Long id);
    Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy);
}
