package com.example.govefficiencyapp.forms;

import com.example.govefficiencyapp.domain.User;

import java.text.Normalizer;

public interface FormFactory {
    Normalizer.Form createTier1Form();
    Normalizer.Form createTier2Form();
    Normalizer.Form createForm(User user);
}
