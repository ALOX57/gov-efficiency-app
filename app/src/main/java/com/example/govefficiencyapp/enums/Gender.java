package com.example.govefficiencyapp.enums;
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    NON_BINARY("non-binary");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}