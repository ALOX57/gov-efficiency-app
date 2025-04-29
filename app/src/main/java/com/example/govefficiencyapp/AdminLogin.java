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

public class AdminLogin extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    Authenticator auth = new Authenticator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login); // This links to activity_second.xml
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(auth.loginAuth("", "")){
                    Intent intent = new Intent(AdminLogin.this, AdminHomepage.class);
                    startActivity(intent);
                }
            }
        });
        Button register = findViewById(R.id.adminRegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(AdminLogin.this, MainActivity.class);
                    startActivity(intent);
            }
        });
    }

}