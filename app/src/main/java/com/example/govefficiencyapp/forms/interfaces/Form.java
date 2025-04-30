package com.example.govefficiencyapp.forms.interfaces;
import java.util.List;
import java.util.Map;

public interface Form {
    String getFormName();
    List<FormSection> getSections();
    void addSection(FormSection section);
    String getFormId();
    String getFormStatus();
    Map<String, Object> getFormData(); // used for loading forms
}