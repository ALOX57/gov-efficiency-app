package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.core.view.WindowInsetsCompat;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Authenticator auth = new Authenticator();
        ElementLogger logger = new ElementLogger();

//        EditText fullNameBox = findViewById(R.id.applicationFullNameTextbox);
//        EditText DOBBox = findViewById(R.id.applicantDOBTextbox);
//        EditText emailBox = findViewById(R.id.applicantEmailTextbox);

//        Map<String, EditText> textBoxes = Map.of(
//                "Full Name", fullNameBox,
//                "Date of Birth", DOBBox,
//                "Email",emailBox
//        );

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String[] textBoxValues = logger.getTextFromBoxes(new EditText[]{fullNameBox, emailBox/*, DOBBox*/});
//                String fullName = textBoxValues[0];
//                String email = textBoxValues[1];
//                String DOB = textBoxValues[2];
//                logger.printValues(textBoxes);
//                if(auth.loginAuth(fullName, email, false)){
//                    Intent intent = new Intent(MainActivity.this, ApplicantLogin.class);
//                    startActivity(intent);
//                }
                Intent intent = new Intent(MainActivity.this, ApplicantLogin.class);
                startActivity(intent);

            }
        });
        Button admin_button = findViewById(R.id.addAdminButton);
        admin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String[] textBoxValues = logger.getTextFromBoxes(new EditText[]{fullNameBox, emailBox/*, DOBBox*/});
//                String fullName = textBoxValues[0];
//                String email = textBoxValues[1];
//                String DOB = textBoxValues[2];
//                logger.printValues(textBoxes);
//                if(auth.loginAuth(fullName, email, true)){
//                    Intent intent = new Intent(MainActivity.this, AdminLogin.class);
//                    startActivity(intent);
//                }
                    Intent intent = new Intent(MainActivity.this, AdminLogin.class);
                    startActivity(intent);
            }
        });

    }

}