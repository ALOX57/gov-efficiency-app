package com.example.govefficiencyapp.forms.section;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.govefficiencyapp.R;

public class PersonalDetailsSection extends Fragment {
    public PersonalDetailsSection() {
        super(R.layout.section_personal_details); // Use your layout resource
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.section_personal_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        // Initialize your UI components here (e.g., EditTexts, Spinners)
        // Example:
        // EditText firstNameEditText = view.findViewById(R.id.firstNameEditText);
    }
}
