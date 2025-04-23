package com.example.govefficiencyapp.search;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    public static List<String> tokenise(String input){

        List<String> tokens = new ArrayList<>();
        String[] parts = input.trim().split("\\ss+");

        for (String part : parts) {
            if (part.contains(":")) {
                String[] fieldValue = part.split(":", 2); // Split on the first colon only
                tokens.add(fieldValue[0]); // Field
                tokens.add(":");            // Separator
                tokens.add(fieldValue[1]); // Value
            } else {
                tokens.add(part); // Add "AND", "OR", etc.
            }
        }
        return tokens;
    }
}
