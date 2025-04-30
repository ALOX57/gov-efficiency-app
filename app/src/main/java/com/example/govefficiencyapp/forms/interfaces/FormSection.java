// FormSection.java
package com.example.govefficiencyapp.forms.interfaces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Map;

public interface FormSection {
    String getSectionTitle();
    View createView(LayoutInflater inflater, ViewGroup parent);
    boolean validate();
    Map<String, String> getData(); // For collecting form data
}