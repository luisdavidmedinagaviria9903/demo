package com.example.luis.medina.bik.leek.demo.controller;


import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import com.example.luis.medina.bik.leek.demo.facade.CustomerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerFacade customerFacade;


    @GetMapping("/findOne/{id}")
    public Object findCustomerById(@PathVariable("id") Integer id){
        return customerFacade.findById(Long.valueOf(id));
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Integer id){
        customerFacade.deleteById(Long.valueOf(id));
        return ResponseEntity
                .ok()
                .body(Boolean.TRUE);

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
