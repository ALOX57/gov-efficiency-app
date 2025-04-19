package com.example.govefficiencyapp.forms;

import com.example.govefficiencyapp.domain.User;

public abstract class FormFactory {
    public abstract Form createForm(User user);
}
