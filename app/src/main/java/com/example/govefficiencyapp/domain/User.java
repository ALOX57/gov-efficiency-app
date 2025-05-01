package com.example.govefficiencyapp.domain;

import java.time.Instant;
import java.util.Date;

public class User {
    final private int id;
    private String name;
    final private boolean isAdmin;
    private String password;
    private String registerDate;
    private int loginStatus = 0;

    public User(int id, String name, boolean isAdmin){
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.registerDate = Date.from(Instant.now()).toString();// Might want to get registerDate with predetermined dates later

    }

    public void login(){
        loginStatus = 1;
    }

    public void logout(){
        loginStatus = 0;
    }

    public int getLoginStatus(){
        return loginStatus;
    }

    public void setPassword(String password) {
        String saltedPassword = password + String.valueOf(this.id);
        this.password = String.valueOf(saltedPassword.hashCode());
    }

    public boolean checkPassword(String enteredPassword){
        String saltedPassword = enteredPassword + String.valueOf(this.id);
        return this.password.equals(String.valueOf(saltedPassword.hashCode()));
    }

    public String getName() {
        return name;
    }
    public boolean getAdminStatus(){
        return isAdmin;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String newRegisterDate){
        /*
        I think this should be removed later. There isn't any reason to change the register date
        after we've finished testing
         */
        this.registerDate = newRegisterDate;
    }

    public int getId() {
        return id;
    }
}
