package com.example.govefficiencyapp.notifications;

import com.example.govefficiencyapp.domain.Application;

public interface ClearanceObserver {
    void onClearanceUpdated(Application app);
}
