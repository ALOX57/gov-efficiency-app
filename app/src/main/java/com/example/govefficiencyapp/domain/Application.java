package com.example.govefficiencyapp.domain;

import com.example.govefficiencyapp.application.ApplicationDetails;
import com.example.govefficiencyapp.enums.Status;
import java.time.LocalDate;

public class Application extends ApplicationDetails {
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate requestDate;
    private LocalDate approvalDate;
    private Clearance clearance;
    private int id;
    private Status status;

    private ApplicationDetails details;

    public Application(LocalDate startDate, LocalDate endDate, LocalDate requestDate, LocalDate approvalDate, Clearance clearance, int id, Status status){
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

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for endDate
    public LocalDate getEndDate() {
        return endDate;
    }

    // Getter for status
    public Status getStatus() {
        return status;
    }

}
