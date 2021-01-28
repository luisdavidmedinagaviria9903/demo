package com.example.luis.medina.bik.leek.demo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "financialinfo")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinancialInfo  implements Serializable {

    private static final long serialVersionUID = -1800631929559763638L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "personGen")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "creationDate")
    private LocalDateTime creationDate;

    @Column(name = "modifyDate")
    private LocalDateTime modifyDate;




}
