package com.example.govefficiencyapp.notifications;

import com.example.govefficiencyapp.domain.Application;

public interface ClearanceObservor {
    void onClearanceUpdated(Application app);
}
