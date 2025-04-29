package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class ApplicantLogin extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    Authenticator auth = new Authenticator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_login_portal); // This links to activity_second.xml
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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