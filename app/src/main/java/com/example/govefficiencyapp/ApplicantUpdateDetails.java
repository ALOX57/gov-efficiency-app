package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class ApplicantUpdateDetails extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_update_details_page); // This links to activity_second.xml
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ApplicantUpdateDetails.this, ApplicantHomepage.class);
                startActivity(intent);
            }
        });
        Button confirmUpdateProfile = findViewById(R.id.confirmUpdateDetails);
        confirmUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("confirmUpdateDetails PLACEHOLDER FUNCTION");
            }
        });
    }


}