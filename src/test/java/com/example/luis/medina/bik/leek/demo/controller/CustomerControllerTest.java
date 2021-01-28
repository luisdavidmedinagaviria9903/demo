package com.example.luis.medina.bik.leek.demo.controller;

import com.example.luis.medina.bik.leek.demo.dto.CustomerDto;
import com.example.luis.medina.bik.leek.demo.facade.CustomerFacade;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerControllerTest.class);

    @Mock
    private CustomerFacade facade;
    private Object CustomerDto;

    @DisplayName("Get a customer by id")
    @Test
    public void getCustomer() {
        
        Assertions.assertEquals(CustomerDto, facade.findById(40L));
        

    }




}
