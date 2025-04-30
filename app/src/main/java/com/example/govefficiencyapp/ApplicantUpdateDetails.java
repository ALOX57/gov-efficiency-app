package com.example.govefficiencyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import java.util.Locale;
import java.util.Map;

public class ApplicantUpdateDetails extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_update_details_page); // This links to activity_second.xml
        EditText fullNameBox = findViewById(R.id.applicationFullNameTextbox);
        EditText familyDetailsBox = findViewById(R.id.applicationFamilyDetails);
        EditText educationDetailsBox = findViewById(R.id.applicationEducationDetails);
        EditText residentialHistoryBox = findViewById(R.id.applicationResidentialHist);
        EditText employmentHistoryBox = findViewById(R.id.applicationEmploymentHist);
        EditText criminalHistoryBox = findViewById(R.id.applicationCriminalHist);
        EditText clearanceReasonBox = findViewById(R.id.applicationClearanceReason);
        EditText requestedDurationBox = findViewById(R.id.applicationRequestedDuration);
        Map<String, EditText> textBoxes = Map.of(
                "Full Name", fullNameBox,
                "Family Details", familyDetailsBox,
                "Education Details", educationDetailsBox,
                "Residential Details", residentialHistoryBox,
                "Employment History", employmentHistoryBox,
                "Criminal History", criminalHistoryBox,
                "Clearance Reason", clearanceReasonBox,
                "Requested Duration", requestedDurationBox
        );

        ElementLogger logger = new ElementLogger();


        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ApplicantUpdateDetails.this, ApplicantHomepage.class);
                startActivity(intent);
            }
        });
        Button confirmUpdateProfile = findViewById(R.id.confirmUpdateDetails);
        confirmUpdateProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String[] textValues = logger.getTextFromBoxMap(textBoxes);

//                String  fullName = textValues[0],
//                        familyDetails = textValues[1],
//                        educationDetails = textValues[2],
//                        residentialHistory = textValues[3],
//                        employmentHistory = textValues[4],
//                        criminalHistory = textValues[5],
//                        clearanceReason = textValues[6],
//                        requestedDuration = textValues[7];


                String fullName = String.valueOf(fullNameBox.getText());
                String familyDetails = String.valueOf(familyDetailsBox.getText());
                String educationDetails = String.valueOf(educationDetailsBox.getText());
                String residentialHistory = String.valueOf(residentialHistoryBox.getText());
                String employmentHistory = String.valueOf(employmentHistoryBox.getText());
                String criminalHistory = String.valueOf(criminalHistoryBox.getText());
                String clearanceReason = String.valueOf(clearanceReasonBox.getText());
                String requestedDuration = String.valueOf(requestedDurationBox.getText());

                logger.printValues(textBoxes);

                System.out.println("confirmUpdateDetails PLACEHOLDER FUNCTION");
            }
        });
    }


}