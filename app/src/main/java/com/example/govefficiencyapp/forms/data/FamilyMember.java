package com.example.govefficiencyapp.forms.data;
import com.example.govefficiencyapp.enums.Gender;

public class FamilyMember {
    private String fullName;
    private String citizenship;
    private String country;
    private String relationship;
    private String address;
    private int residenceSince; // in years
    private String occupation;
    private Gender gender;
    private boolean isEmergencyContact;

    private FamilyMember(String fullName, String citizenship, String country, String relationship, String address, int residenceSince, String occupation, Gender gender, boolean isEmergencyContact) {
        this.fullName = fullName;
        this.citizenship = citizenship;
        this.country = country;
        this.relationship = relationship;
        this.address = address;
        this.residenceSince = residenceSince;
        this.occupation = occupation;
        this.gender = gender;
        this.isEmergencyContact = isEmergencyContact;
    }
}