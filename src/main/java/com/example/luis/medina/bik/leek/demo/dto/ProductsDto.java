package com.example.luis.medina.bik.leek.demo.dto;

import com.example.luis.medina.bik.leek.demo.domain.enums.ProductState;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class ProductsDto implements Serializable {

    private static final long serialVersionUID = 2850615714280595589L;
    private Long id;
    private ProductState state;
    private String productName;
    private Integer amount;
    private Integer term;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creationDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyDate;

}
