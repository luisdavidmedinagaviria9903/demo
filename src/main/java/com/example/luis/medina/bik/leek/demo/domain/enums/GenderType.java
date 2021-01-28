package com.example.luis.medina.bik.leek.demo.domain.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum GenderType {

    OTHER(0, "Otro", 100, "O"),
    MALE(1, "Masculino", 90, "M"),
    FEMALE(2, "Femenino", 0, "F");

    @Setter
    private int value;
    @Setter
    private String description;
    @Setter
    private int score;
    @Setter
    private String initials;

    GenderType(int value, String description, int score, String initials) {
        this.value = value;
        this.description = description;
        this.score = score;
        this.initials = initials;
    }

    public static GenderType getByIndex(int index) {
        for (GenderType genderType : GenderType.values())
            if (genderType.getValue() == index)
                return genderType;
        return null;
    }


}
