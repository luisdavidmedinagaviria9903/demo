package com.example.luis.medina.bik.leek.demo.dto;


import com.example.luis.medina.bik.leek.demo.domain.enums.GenderType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class CustomerDto implements Serializable {

    private static final long serialVersionUID = -3829411906470203000L;
    private Long id;
    private String email;
    private String document;
    private String firstName;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private GenderType genderType;
    private String mobile;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    private Integer age;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creationDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyDate;

}
