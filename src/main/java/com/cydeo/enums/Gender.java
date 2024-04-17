package com.cydeo.enums;

import lombok.Getter;

@Getter
public enum Gender {
    Male("Male"),Female("Female");
    private String value;

    Gender(String value) {
        this.value = value;
    }

}
