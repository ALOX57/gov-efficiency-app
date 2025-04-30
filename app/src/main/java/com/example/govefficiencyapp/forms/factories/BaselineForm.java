package com.example.govefficiencyapp.forms.factories;
import com.example.govefficiencyapp.forms.interfaces.*;
import com.example.govefficiencyapp.forms.section.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BaselineForm implements Form {
    private final List<FormSection> sections = new ArrayList<>();
    private final String formId;
    private String status;

    public BaselineForm() {
        this.formId = UUID.randomUUID().toString().substring(0, 8); // randomly generate an id
        initializeSections();
    }

    private void initializeSections() {
        // Add default sections for Baseline form
        sections.add((FormSection) new PersonalDetailsSection());
        sections.add((FormSection) new FamilyMemberSection());
    }

    @Override
    public String getFormName() {
        return "Baseline Form";
    }

    @Override
    public List<FormSection> getSections() {
        return new ArrayList<>(sections); // Return copy for immutability
    }

    @Override
    public void addSection(FormSection section) {
        sections.add(section);
    }

    @Override
    public Map<String, Object> getFormData() {
        return null;
    }

    public String getFormId() {
        return formId;
    }

    public String getFormStatus() {
        return status;
    }
}