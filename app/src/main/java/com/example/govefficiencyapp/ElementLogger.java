package com.example.govefficiencyapp;
import android.widget.EditText;

import java.util.Collection;
import java.util.Map;
public class ElementLogger {
    public void printValues(Map<String, EditText> textBoxes){
        for (String title: textBoxes.keySet()) {
            System.out.println(title + ": " + String.valueOf(textBoxes.get(title).getText()));
        }
    }
    public String[] getTextFromBoxes(EditText[] boxes){
        String[] textEntries = new String[boxes.length];
        for (int i = 0; i < boxes.length; i++) {
            textEntries[i] = String.valueOf(boxes[i].getText());
        }
        return textEntries;
    }
    public String[] getTextFromBoxMap(Map<String, EditText> boxMap){
        Collection<EditText> values = boxMap.values();
        String[] textEntries = new String[values.size()];

        int i = 0;
        for (EditText box : values) {
            textEntries[i++] = box.getText().toString();
        }
        return textEntries;
    }
}
