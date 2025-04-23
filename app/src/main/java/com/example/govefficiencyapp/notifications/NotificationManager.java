package com.example.govefficiencyapp.notifications;

import com.example.govefficiencyapp.domain.Application;
import com.example.govefficiencyapp.domain.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotificationManager implements ClearanceObservor{
    private int currentUserID;
    private List<Application> applications;
    private final int daysBeforeExpiry = 7;
    private final List<NotificationManager> observers = new ArrayList<>();

    public NotificationManager(int currentUserID, List<Application> applications) {
        this.currentUserID = currentUserID;
        this.applications = applications;
    }

    public void addObserver(NotificationManager observer) {
        observers.add(observer);
    }

    public void removeObserver(NotificationManager observer) {
        observers.remove(observer);
    }

    // Notify all observers of a clearance update
    private void notifyObservers(Application app) {
        for (NotificationManager observer : observers) {
            observer.onClearanceUpdated(app);
        }
    }

    @Override
    public void onClearanceUpdated(Application app){
        // TODO: Trigger application approval/denial notification if matches currentUserID
    }

    public void notifyOnLogin() {
        // TODO: Trigger expired notifications when user logs in
    }

    public void notifyExpiringSoon() {
        // TODO: Trigger "expiring soon" notifications
    }

    //TODO: Implement Application.getEndDate()
//    private boolean isExpired(Application app) {
//        LocalDate today = LocalDate.now();
//        return app.getEndDate().isBefore(today);
//    }
//
//    private boolean isExpiringSoon(Application app) {
//        LocalDate today = LocalDate.now();
//        return app.getEndDate().isAfter(today) && app.getEndDate().isBefore(today.plusDays(daysBeforeExpiry));
//    }

    public void notifyStatusChange(Application app) {
        // TODO: Logic for status change
    }
}
