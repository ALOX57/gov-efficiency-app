package com.example.govefficiencyapp.domain;

public class Application {
    private String startDate;
    private String endDate;
    private String requestDate;
    private String approvalDate;
    private Clearance clearance;
    private int id;

    public Application(String startDate, String endDate, String requestDate, String approvalDate, Clearance clearance, int id){
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.clearance = clearance;
        this.id = id;
    }
}
