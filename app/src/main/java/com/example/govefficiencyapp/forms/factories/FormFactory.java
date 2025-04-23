package com.example.govefficiencyapp.forms.factories;

import com.example.govefficiencyapp.forms.Form;

public interface FormFactory {
    Form createForm();  // Should return Form, not the factory itself
}