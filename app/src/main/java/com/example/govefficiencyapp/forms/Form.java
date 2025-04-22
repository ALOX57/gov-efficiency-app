package com.example.govefficiencyapp.forms;

import android.content.Context;
import java.util.List;
import java.util.Map;

public abstract class Form {
    protected Context context;

    public Form(Context context) {
        this.context = context;
    }
    public void saveDraft() {
        // Implementation for auto-save drafts
    }
}