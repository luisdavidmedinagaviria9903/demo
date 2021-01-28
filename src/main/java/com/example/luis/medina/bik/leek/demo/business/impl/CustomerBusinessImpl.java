package com.example.luis.medina.bik.leek.demo.business.impl;

import com.example.luis.medina.bik.leek.demo.business.CustomerBusiness;
import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CustomerBusinessImpl implements CustomerBusiness {

    @Autowired
    private CustomerService customerService;

    @Override
    public Customer findById(Long id) {
        return customerService.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerService.save(customer);
    }

    @Override
    public void deleteById(Long id) {
        customerService.deleteById(id);
    }

    @Override
    public Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());
        return customerService.findAllCustomer(paging);
    }
}
