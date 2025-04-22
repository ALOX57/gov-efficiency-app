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
    private final List<ClearanceObserver> observers = new ArrayList<>();

    public NotificationManager(int currentUserID, List<Application> applications) {
        this.currentUserID = currentUserID;
        this.applications = applications;
    }

    public void addObserver(ClearanceObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ClearanceObserver observer) {
        observers.remove(observer);
    }

    // Notify all observers of a clearance update
    private void notifyObservers(Application app) {
        for (ClearanceObserver observer : observers) {
            observer.onClearanceUpdated(app);
        }
    }

    @Override
    public void onClearanceUpdated(Application app) {
        if (app.getUserId() == currentUserID) {
            // Trigger application approval/denial notification
            System.out.println("Notification: Application status updated for user " + currentUserID);
        }
    }

    public void notifyOnLogin() {
        for (Application app : applications) {
            if (isExpired(app)) {
                System.out.println("Notification: Application " + app.getId() + " has expired.");
            } else if (isExpiringSoon(app)) {
                System.out.println("Notification: Application " + app.getId() + " is expiring soon.");
            }
        }
    }

    public void notifyExpiringSoon() {
        for (Application app : applications) {
            if (isExpiringSoon(app)) {
                System.out.println("Notification: Application " + app.getId() + " is expiring soon.");
            }
        }
    }

    private boolean isExpired(Application app) {
        LocalDate today = LocalDate.now();
        return app.getEndDate().isBefore(today);
    }

    private boolean isExpiringSoon(Application app) {
        LocalDate today = LocalDate.now();
        return app.getEndDate().isAfter(today) && app.getEndDate().isBefore(today.plusDays(daysBeforeExpiry));
    }
    public void notifyStatusChange(Application app) {
        System.out.println("Notification: Status of application " + app.getId() + " has changed to " + app.getStatus());
        notifyObservers(app);
    }
}
