package com.example.govefficiencyapp.manager;


import com.example.govefficiencyapp.domain.Application;
import com.example.govefficiencyapp.notifications.NotificationManager;
import com.example.govefficiencyapp.search.Parser;
import com.example.govefficiencyapp.search.Query;
import com.example.govefficiencyapp.search.Tokenizer;
import com.example.govefficiencyapp.tree.AVLTree;
import com.example.govefficiencyapp.enums.Status;
import com.example.govefficiencyapp.forms.Form;
import com.example.govefficiencyapp.forms.factories.FormFactory;
import com.example.govefficiencyapp.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to manage clearance applications and system logic.
 */
public class ClearanceManager {
    public static ClearanceManager instance;

    private List<Application> applications;
    private AVLTree tree;
    private NotificationManager notificationManager;


    // private constructor for singleton class
    private ClearanceManager() {
        this.applications = new ArrayList<>();
        this.tree = new AVLTree();
    }

    public static ClearanceManager getInstance() {
        if (instance == null) {
            instance = new ClearanceManager();
        }
        return instance;
    }

    public void setNotificationManager(NotificationManager nm) {
        this.notificationManager = nm;
    }

    public void addApplication(Application app) {
        applications.add(app);
        tree.insert(app);
    }

    public void updateApplicationStatus(Application app, Status newStatus) {
        app.setStatus(newStatus);
        if (notificationManager != null) {
            notificationManager.notifyStatusChange(app); // Observer-style call
        }
    }

    public List<Application> search(String input) {
        List<String> tokens = Tokenizer.tokenise(input);
        Query query = Parser.parse(tokens);

        List<Application> results = new ArrayList<>();

        // TODO: Replace with actual search filtering logic
        return results;
    }

//    public Form requestForm(FormFactory factory, User user) {
//        return factory.createForm(user); // Abstract Factory usage
//    }


}
