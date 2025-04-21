package com.example.govefficiencyapp.forms;
import com.example.govefficiencyapp.domain.User;

public class FamilyMember {

    private String fullName;
    private String relationship;
    private String contactNum;
    private String occupation;
    private Date dob;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private boolean isEmergencyContact;

    private FamilyMember(String fullName, Date dob, String nationality, String contactNum, String email, Gender gender, MaritalStatus maritalStatus) {
        this.fullName = fullName;
        this.dob = dob;
        this.nationality =nationality;
        this.contactNum = contactNum;
        this.email = email;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}