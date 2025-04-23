package com.example.govefficiencyapp.forms.data;

import java.util.LinkedList;
import java.util.List;

public class FamilyDetails {
    private final LinkedList<FamilyMember> members;
    private PersonalDetails applicant;

    public FamilyDetails() {
        this.members = new LinkedList<>();
    }

    public void setApplicant(PersonalDetails personalDetails) {
        this.applicant = personalDetails;
    }
    public void addMember(FamilyMember member) {
        members.add(member);
    }

    public void removeMember(FamilyMember member) {
        members.remove(member);
    }

    public List<FamilyMember> getAllMembers() {
        return new LinkedList<>(members); // Return a copy for immutability
    }

    public PersonalDetails getApplicant() {
        return applicant;
    }

    public int size() {
        return members.size();
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }
}