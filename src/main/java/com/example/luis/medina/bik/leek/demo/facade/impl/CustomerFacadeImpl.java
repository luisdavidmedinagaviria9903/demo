package com.example.luis.medina.bik.leek.demo.facade.impl;

import com.example.luis.medina.bik.leek.demo.business.CustomerBusiness;
import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import com.example.luis.medina.bik.leek.demo.facade.CustomerFacade;
import com.example.luis.medina.bik.leek.demo.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public class CustomerFacadeImpl implements CustomerFacade {

    @Autowired
    private CustomerBusiness customerBusiness;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public CustomerDto findByDocument(String document) {
        return mapper(customerBusiness.findByDocument(document));
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return mapper(customerBusiness.save(mapper(customerDto)));
    }

    @Override
    public Page<Customer> findAllCustomer(Integer pageNo, Integer pageSize, String sortBy) {
        return customerBusiness.findAllCustomer(pageNo,pageSize,sortBy);
    }

    private CustomerDto mapper(Customer customer) {
        return customerMapper.convertCustomerDtoFromCustomer(customer);
    }

    private Customer mapper(CustomerDto customerDto) {
        return customerMapper.convertCustomerFromCustomerDto(customerDto);
    }


}
