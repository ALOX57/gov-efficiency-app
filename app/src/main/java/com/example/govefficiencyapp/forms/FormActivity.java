package com.example.govefficiencyapp.forms;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.govefficiencyapp.R;
import com.example.govefficiencyapp.forms.factories.*;
import com.example.govefficiencyapp.forms.interfaces.Form;
import com.example.govefficiencyapp.forms.interfaces.FormSection;

import java.util.Map;

public class FormActivity extends AppCompatActivity {
    private LinearLayout formContainer;
    private Form currentForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_container);

        formContainer = findViewById(R.id.formContainer);

        // Get form type from intent
        String formType = getIntent().getStringExtra("FORM_TYPE");
        currentForm = new BaselineForm();

        renderForm();
    }

    private void renderForm() {
        LayoutInflater inflater = LayoutInflater.from(this);

        for (FormSection section : currentForm.getSections()) {
            View sectionView = section.createView(inflater, formContainer);
            formContainer.addView(sectionView);

            // Add divider between sections
            View divider = new View(this);
            divider.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, 1));
            divider.setBackgroundColor(Color.LTGRAY);
            formContainer.addView(divider);
        }
    }

    private void submitForm() {
        // TODO: store json data into firebase
    }

    private boolean validateForm() {
        // TODO: validation
        return true;
    }

    private Map<String, String> collectFormData() {
        // TODO: serailization into json format
        return null;
    }
}