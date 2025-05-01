package com.example.govefficiencyapp.domain;

public class User {
    private int id;
    private String name;
    private boolean isAdmin;
    private int password;

    public User(int id, String name, boolean isAdmin){
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public void setPassword(String password) {
        this.password = password.hashCode();
    }

    public boolean checkPassword(String enteredPassword){
        return this.password==enteredPassword.hashCode();
    }

    public String getName() {
        return name;
    }
    public boolean getAdminStatus(){
        return isAdmin;
    }
}
