package com.example.govefficiencyapp.forms.data;
public class EducationRecord {
    String institutionName;
    int yearsAttended;
    String qualification;

    public EducationRecord (String institutionName, int yearsAttended, String qualification) {
        this.institutionName = institutionName;
        this.yearsAttended = yearsAttended;
        this.qualification = qualification;
    }

}
