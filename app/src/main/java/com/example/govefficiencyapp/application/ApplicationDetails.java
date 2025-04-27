package com.example.govefficiencyapp.application;

import com.example.govefficiencyapp.domain.Application;
import com.example.govefficiencyapp.domain.Clearance;
import com.example.govefficiencyapp.enums.Status;

public class ApplicationDetails {
    public String personalDetails;
    public String familyDetails;
    public String educationDetails;
    public String residentialHist;
    public String employmentHist;
    public String criminalHist;
    public String clearanceReason;
    public int requestedDuration;

    public ApplicationDetails (String personalDetails, String familyDetails, String educationDetails, String residentialHist, String employmentHist, String criminalHist, String clearanceReason, int requestedDuration) {
        this.personalDetails = personalDetails;
        this.familyDetails = familyDetails;
        this.educationDetails = educationDetails;
        this.residentialHist = residentialHist;
        this.employmentHist = employmentHist;
        this.criminalHist = criminalHist;
        this.clearanceReason = clearanceReason;
        this.requestedDuration = requestedDuration;

    }

    public ApplicationDetails() {

    }

    public void manipulateDetails(){

    }
}
