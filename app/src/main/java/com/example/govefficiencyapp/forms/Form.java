package com.example.govefficiencyapp.forms;

import java.util.Map;

public interface Form {
    Map<String, String> getRequiredFields();
    Map<String, String> getSubmittedFields();
    String getTitle();
}
