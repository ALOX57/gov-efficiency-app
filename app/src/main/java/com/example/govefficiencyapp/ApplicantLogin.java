package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import java.util.Map;

public class ApplicantLogin extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    Authenticator auth = new Authenticator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_login_portal); // This links to activity_second.xml
        ElementLogger logger = new ElementLogger();
        EditText fullNameBox = findViewById(R.id.applicationFullNameTextbox);
        EditText emailBox = findViewById(R.id.applicantEmailTextbox);
        EditText DOBBox = findViewById(R.id.applicantDOBTextbox);
        Map<String, EditText> textBoxes = Map.of(
                "Full Name", fullNameBox,
                "Date Of Birth", DOBBox,
                "Email", emailBox
        );



        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] textBoxValues = logger.getTextFromBoxes(new EditText[]{fullNameBox, emailBox, DOBBox});
                String fullName = textBoxValues[0];
                String email = textBoxValues[1];
                String DOB = textBoxValues[2];
                logger.printValues(textBoxes);
                if(auth.loginAuth("", "")){
                    Intent intent = new Intent(ApplicantLogin.this, ApplicantHomepage.class);
                    startActivity(intent);
                }

            }
        });


        Button register = findViewById(R.id.applicantRegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(auth.loginAuth("", "")){
                    Intent intent = new Intent(ApplicantLogin.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }

}