package com.example.luis.medina.bik.leek.demo.domain.enums;


import lombok.Getter;
import lombok.Setter;

import java.util.stream.Stream;

@Getter
public enum ProductState {

    NA(0,"NA","No aplica");

    @Getter
    @Setter
    private Integer index;

    @Getter
    @Setter
    private String value;

    @Getter
    @Setter
    private String name;

    ProductState(Integer index, String value, String name){
        this.index = index;
        this.value = value;
        this.name = name;
    }

    public static ProductState getProductStateByIndex(Integer index){
        return Stream.of(ProductState.values())
                .filter(p -> p.getIndex().equals(index))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

    }



}
