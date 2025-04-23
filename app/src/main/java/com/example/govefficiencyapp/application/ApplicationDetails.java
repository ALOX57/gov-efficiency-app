package com.example.govefficiencyapp.application;

import com.example.govefficiencyapp.domain.Application;
import com.example.govefficiencyapp.domain.Clearance;
import com.example.govefficiencyapp.enums.Status;
import com.example.govefficiencyapp.forms.EducationDetails;
import com.example.govefficiencyapp.forms.FamilyDetails;
import com.example.govefficiencyapp.forms.PersonalDetails;

public class ApplicationDetails {
    public PersonalDetails personalDetails;
    public FamilyDetails familyDetails;
    public EducationDetails educationDetails;
    public String residentialHist;
    public String employmentHist;
    public String criminalHist;
    public String clearanceReason;
    public int requestedDuration;

    public ApplicationDetails (PersonalDetails personalDetails, FamilyDetails familyDetails, EducationDetails educationDetails, String residentialHist, String employmentHist, String criminalHist, String clearanceReason, int requestedDuration) {
        this.personalDetails = personalDetails;
        this.familyDetails = familyDetails;
        this.educationDetails = educationDetails;
        this.residentialHist = residentialHist;
        this.employmentHist = employmentHist;
        this.criminalHist = criminalHist;
        this.clearanceReason = clearanceReason;
        this.requestedDuration = requestedDuration;

    }
    public void manipulateDetails(){

    }
}
