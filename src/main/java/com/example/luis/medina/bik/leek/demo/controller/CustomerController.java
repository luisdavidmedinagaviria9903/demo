package com.example.luis.medina.bik.leek.demo.controller;


import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import com.example.luis.medina.bik.leek.demo.facade.CustomerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/{document}")
    public Object findCustomerById(@PathVariable("document") String document){
        return customerFacade.findByDocument(document);
    }

    @PostMapping("/save")
    public Object saveCustomer(@RequestBody CustomerDto customerDto){
        return customerFacade.save(customerDto);
    }


    @PostMapping("/findAll")
    public Object findAllPageable( @RequestParam(defaultValue = "0") Integer pageNo,
                                    @RequestParam(defaultValue = "10") Integer pageSize,
                                    @RequestParam(defaultValue = "id") String sortBy){
        return customerFacade.findAllCustomer(pageNo,pageSize,sortBy);
    }

}
