package com.example.luis.medina.bik.leek.demo.mapper;

import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer convertCustomerFromCustomerDto(CustomerDto customerDto);

    CustomerDto convertCustomerDtoFromCustomer(Customer customer);

}
