package com.example.govefficiencyapp.domain;

import com.example.govefficiencyapp.application.ApplicationDetails;
import com.example.govefficiencyapp.enums.Status;

public class Application extends ApplicationDetails {
    private String startDate;
    private String endDate;
    private String requestDate;
    private String approvalDate;
    private Clearance clearance;
    private int id;
    private Status status;

    private ApplicationDetails details;

    public Application(String startDate, String endDate, String requestDate, String approvalDate, Clearance clearance, int id, Status status){
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
        this.clearance = clearance;
        this.id = id;
        this.status = status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
