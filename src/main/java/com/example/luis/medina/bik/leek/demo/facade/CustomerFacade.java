package com.example.luis.medina.bik.leek.demo.facade;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import org.springframework.data.domain.Page;

public interface CustomerFacade {

    CustomerDto findById(Long id);
    CustomerDto save(CustomerDto customerDto);
    void deleteById(Long id);
    Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy);

}
