package com.example.govefficiencyapp.enums;
public enum MaritalStatus {
    SINGLE("single"),
    DIVORCED("divorced"),
    WIDOWED("widowed"),
    MARRIED("married");

    private final String displayName;

    MaritalStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}