package com.example.govefficiencyapp.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a placeholder class to be replaced when we have the database take over user records.
 */
public class UserList {
    private Set<User> userList = new HashSet<>();

    public UserList(){
        /*
        PLACEHOLDER FOR TESTING ONLY!!!
        ABSOLUTELY 100% INSECURE!!!
         */
        User user_a = new User(1, "a", true);
        User user_b = new User(2, "b", false);
        User user_c = new User(3, "c", false);
        user_a.setPassword("1234");
        user_b.setPassword("password");
        user_c.setPassword("guest");
        userList.add(user_a);
        userList.add(user_b);
        userList.add(user_c);
    }

    public Set<User> getUserList() {
        return userList;
    }
    public void addUser(User newUser){
        userList.add(newUser);
    }
}
