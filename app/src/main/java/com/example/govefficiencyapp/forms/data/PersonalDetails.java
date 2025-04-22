package com.example.govefficiencyapp.forms.data;
import com.example.govefficiencyapp.enums.MaritalStatus;
import com.example.govefficiencyapp.enums.Gender;
import java.util.Date;

public class PersonalDetails {
    private String fullName;
    private Date dob;
    private String placeOfBirth;
    private String citizenship;
    private String contactNum;
    private String email;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private PersonalDetails(String fullName, Date dob, String citizenship, String contactNum, String email,  Gender gender, MaritalStatus maritalStatus) {
        this.fullName = fullName;
        this.dob = dob;
        this.citizenship =citizenship;
        this.contactNum = contactNum;
        this.email = email;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

}
