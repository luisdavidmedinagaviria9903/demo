package com.example.luis.medina.bik.leek.demo.facade;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import org.springframework.data.domain.Page;

public interface CustomerFacade {

    CustomerDto findByDocument(String document);
    CustomerDto save(CustomerDto customerDto);
    Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy);

}
