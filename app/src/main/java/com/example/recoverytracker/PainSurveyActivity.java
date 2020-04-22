package com.example.recoverytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PainSurveyActivity extends AppCompatActivity {

    public static final String EXTRA_PAIN_SURVEY_RESULT = "com.example.recoverytracker.PAIN_SURVEY_RESULT";

    private final PainSurveyResponse painSurveyResponse = PainSurveyResponse.getInstance();
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain_survey);

        painSurveyResponse.clear();

        submitButton = findViewById(R.id.pain_survey_submit_button);
        submitButton.setVisibility(View.INVISIBLE);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.q1MildPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q1, PainDescriptor.MILD);
                break;
            case R.id.q1DiscomfortingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q1, PainDescriptor.DISCOMFORTING);
                break;
            case R.id.q1DistressingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q1, PainDescriptor.DISTRESSING);
                break;
            case R.id.q1HorriblePainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q1, PainDescriptor.HORRIBLE);
                break;
            case R.id.q1ExcruciatingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q1, PainDescriptor.EXCRUCIATING);
                break;
            case R.id.q2MildPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q2, PainDescriptor.MILD);
                break;
            case R.id.q2DiscomfortingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q2, PainDescriptor.DISCOMFORTING);
                break;
            case R.id.q2DistressingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q2, PainDescriptor.DISTRESSING);
                break;
            case R.id.q2HorriblePainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q2, PainDescriptor.HORRIBLE);
                break;
            case R.id.q2ExcruciatingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q2, PainDescriptor.EXCRUCIATING);
                break;
            case R.id.q3MildPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q3, PainDescriptor.MILD);
                break;
            case R.id.q3DiscomfortingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q3, PainDescriptor.DISCOMFORTING);
                break;
            case R.id.q3DistressingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q3, PainDescriptor.DISTRESSING);
                break;
            case R.id.q3HorriblePainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q3, PainDescriptor.HORRIBLE);
                break;
            case R.id.q3ExcruciatingPainRadioButton:
                if (checked) painSurveyResponse.updateResponse(PainSurveyQuestions.Q3, PainDescriptor.EXCRUCIATING);
                break;
            default:
                break;
        }
        updateSubmitButton();
    }

    private void updateSubmitButton() {
        if (painSurveyResponse.isComplete()) submitButton.setVisibility(View.VISIBLE);
    }

    public void submit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
