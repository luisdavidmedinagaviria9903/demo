package com.example.luis.medina.bik.leek.demo.domain;


import com.example.luis.medina.bik.leek.demo.domain.enums.GenderType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@Entity
@Table(name = "customer")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer implements Serializable {

    private static final long serialVersionUID = -1396164414026490025L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "document")
    private String document;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "secondLastName")
    private String secondLastName;

    @Column(name = "gender")
    private GenderType genderType;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Transient
    private Integer age;

    @Column(name = "creationDate")
    private LocalDateTime creationDate;

    @Column(name = "modifyDate")
    private LocalDateTime modifyDate;


    public Integer getAge() {
        if(this.birthDate == null)
            return -1;

        LocalDate birthDate = this.birthDate;
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
