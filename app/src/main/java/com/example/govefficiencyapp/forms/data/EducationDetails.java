package com.example.govefficiencyapp.forms.data;

import java.util.LinkedList;
import java.util.List;

public class EducationDetails {
    private final LinkedList<EducationRecord> records;
    private PersonalDetails applicant;

    public EducationDetails() {
        this.records = new LinkedList<>();
    }

    public void setApplicant(PersonalDetails personalDetails) {
        this.applicant = personalDetails;
    }
    public void addRecord(EducationRecord record) {
        records.add(record);
    }

    public void removeRecord(EducationRecord record) {
        records.remove(record);
    }

    public List<EducationRecord> getAllRecords() {
        return new LinkedList<>(records); // Return a copy for immutability
    }

    public PersonalDetails getApplicant() {
        return applicant;
    }

    public int size() {
        return records.size();
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }
}