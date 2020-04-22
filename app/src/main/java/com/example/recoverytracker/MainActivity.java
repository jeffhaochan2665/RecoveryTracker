package com.example.recoverytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    PainSurveyResponse painSurveyResponse = PainSurveyResponse.getInstance();
    PAMResponse pamResponse = PAMResponse.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button surveyRecordsButton = findViewById(R.id.survey_records_button);
        if (painSurveyResponse.isComplete() || pamResponse.hasResponded()) {
            surveyRecordsButton.setVisibility(View.VISIBLE);
        } else {
            surveyRecordsButton.setVisibility(View.GONE);
        }
    }

    public void toPAMSurvey(View view) {
        Intent intent = new Intent(this, PAMActivity.class);
        startActivity(intent);
    }

    public void toPainSurvey(View view) {
        Intent intent = new Intent(this, PainSurveyActivity.class);
        startActivity(intent);
    }

    public void toSurveyRecords(View view) {
        Intent intent = new Intent(this, SurveyRecordsActivity.class);
        startActivity(intent);
    }

    public void toStepCounter(View view) {
        Intent intent = new Intent(this, )
    }
}
