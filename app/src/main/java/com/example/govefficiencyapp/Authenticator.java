package com.example.govefficiencyapp;

import com.example.govefficiencyapp.domain.User;
import com.example.govefficiencyapp.domain.UserList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Authenticator {
    public boolean loginAuth(String username, String password, Boolean adminLogin){
        UserList databaseUserlist = new UserList();
        Set<User> userList = databaseUserlist.getUserList(); // Replace this with an actual list of all usernames in database
        for (User user:
                userList) {
            if(user.getName().equals(username)){
                if(adminLogin == user.getAdminStatus()){
                    System.out.println("VALID USERNAME");
                    if(user.checkPassword(password)){
                        return true;
                    }else{
                        System.out.println("INCORRECT PASSWORD");
                        return false;
                    }
                } else{
                    System.out.println("INCORRECT ACCOUNT TYPE");
                    return false;
                }

            }
        }

//        return true;        //ONLY A PLACEHOLDER

        System.out.println("INVALID USERNAME");
        return false;
    };
}
