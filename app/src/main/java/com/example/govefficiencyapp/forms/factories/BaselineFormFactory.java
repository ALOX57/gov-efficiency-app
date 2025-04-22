package com.example.govefficiencyapp.forms.factories;

import android.content.Context;
import com.example.govefficiencyapp.forms.Form;

public class BaselineFormFactory implements FormFactory {
    private final Context context;

    public BaselineFormFactory(Context context) {
        this.context = context;
    }

    @Override
    public Form createForm() {
        // TODO: logic to create the form using sections interface
        return null;
    }
}