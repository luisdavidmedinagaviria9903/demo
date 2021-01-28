package com.example.luis.medina.bik.leek.demo.domain;

import com.example.luis.medina.bik.leek.demo.domain.enums.ProductState;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products implements Serializable {

    private static final long serialVersionUID = -6233507825416555998L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "personGen")
    private Long id;

    @Column(name = "productState")
    private ProductState state;

    @Column(name = "productName")
    private String productName;

    @Column(name = "creationDate")
    private LocalDateTime creationDate;

    @Column(name = "modifyDate")
    private LocalDateTime modifyDate;



}
