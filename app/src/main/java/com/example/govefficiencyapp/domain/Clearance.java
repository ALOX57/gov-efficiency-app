package com.example.govefficiencyapp.domain;

public class Clearance {
    private String clearanceType;
    private int duration;

    public Clearance(String clearanceType, int duration){
        this.clearanceType = clearanceType;
        this.duration = duration;
    }
}
