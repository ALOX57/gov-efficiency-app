package com.example.govefficiencyapp.notifications;

import com.example.govefficiencyapp.domain.Application;

import java.util.List;

public class NotificationManager implements ClearanceObservor{
    private int currentUserID;
    private List<Application> applications;
    private final int daysBeforeExpiry = 7;

    public NotificationManager(int currentUserID, List<Application> applications) {
        this.currentUserID = currentUserID;
        this.applications = applications;
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

    private boolean isExpired(Application app) {
        // TODO: Check if endDate has passed
        return false;
    }

    private boolean isExpiringSoon(Application app) {
        // TODO: Check if expiry is within X days
        return false;
    }

    public void notifyStatusChange(Application app) {
        // TODO: Logic for status change
    }
}
