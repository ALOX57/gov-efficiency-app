package com.example.govefficiencyapp.forms;
import com.example.govefficiencyapp.domain.User;

import java.util.Date;

;

public class PersonalDetails {
    private String fullName;
    private Date dob;
    private String nationality;
    private String contactNum;
    private String email;
    private MaritalStatus maritalStatus;
    private Gender gender;

    private PersonalDetails(String fullName, Date dob, String nationality, String contactNum, String email,  Gender gender, MaritalStatus maritalStatus) {
        this.fullName = fullName;
        this.dob = dob;
        this.nationality =nationality;
        this.contactNum = contactNum;
        this.email = email;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

}
