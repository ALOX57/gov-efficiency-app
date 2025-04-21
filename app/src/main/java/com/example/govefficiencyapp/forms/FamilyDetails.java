package com.example.govefficiencyapp.forms;
import com.example.govefficiencyapp.domain.User;

import java.util.LinkedList;

// This class is a collection of family member objects
public class FamilyDetails {

    private LinkedList<FamilyMember> familyMembers;
    public FamilyDetails() {
        this.familyMembers = new LinkedList<FamilyMember>();
    }
    public void addFamilyMember(FamilyMember member) {
        this.familyMembers.add(member);
    }

}
