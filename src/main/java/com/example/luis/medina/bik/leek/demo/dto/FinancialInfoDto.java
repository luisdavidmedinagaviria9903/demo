package com.example.luis.medina.bik.leek.demo.dto;


import com.example.luis.medina.bik.leek.demo.domain.Customer;
import com.example.luis.medina.bik.leek.demo.domain.Products;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class FinancialInfoDto implements Serializable {

    private Long id;
    @Builder.Default
    private List<Products> products = new ArrayList<>();
    private Customer customer;
    private LocalDateTime creationDate;
    private LocalDateTime modifyDate;

}
