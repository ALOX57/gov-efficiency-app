package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class AdminHomepage extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_homepage); // This links to activity_second.xml
        Button addAdminButton = findViewById(R.id.addAdminButton);
        addAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("addAdminButton PLACEHOLDER FUNCTION");
            }
        });
        Button createDeptButton = findViewById(R.id.createDeptButton);
        createDeptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("createDeptButton PLACEHOLDER FUNCTION");
            }
        });
        Button createClearanceButton = findViewById(R.id.createClearanceButton);
        createClearanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("createClearanceButton PLACEHOLDER FUNCTION");
            }
        });
        Button checkApplicationsButton = findViewById(R.id.checkApplicationsButton);
        checkApplicationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("checkApplicationsButton PLACEHOLDER FUNCTION");
            }
        });
        Button logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHomepage.this, AdminLogin.class);
                startActivity(intent);
            }
        });
    }


}