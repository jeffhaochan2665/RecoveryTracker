package com.example.recoverytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SurveyRecordsActivity extends AppCompatActivity {

    PAMResponse pamSurveyResponse = PAMResponse.getInstance();
    PainSurveyResponse painSurveyResponse = PainSurveyResponse.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_records);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (pamSurveyResponse.hasResponded()) {
            findViewById(R.id.PAM_record_title_textView).setVisibility(View.VISIBLE);
            findViewById(R.id.PAM_record_imageView).setVisibility(View.VISIBLE);
            findViewById(R.id.PAM_record_imageView).setBackgroundResource(pamSurveyResponse.getImageID());
            ((TextView)findViewById(R.id.PAM_record_time_textView)).setText(pamSurveyResponse.getDate().toString());
        } else {
            findViewById(R.id.PAM_record_title_textView).setVisibility(View.GONE);
            findViewById(R.id.PAM_record_imageView).setVisibility(View.GONE);
        }

        if (painSurveyResponse.isComplete()) {
            findViewById(R.id.pain_record_linearLayout).setVisibility(View.VISIBLE);
            ((TextView)findViewById(R.id.pain_response_1_answer_textView)).setText(painSurveyResponse.getResponse(PainSurveyQuestions.Q1).description);
            ((TextView)findViewById(R.id.pain_response_2_answer_textView)).setText(painSurveyResponse.getResponse(PainSurveyQuestions.Q2).description);
            ((TextView)findViewById(R.id.pain_response_3_answer_textView)).setText(painSurveyResponse.getResponse(PainSurveyQuestions.Q3).description);
            ((TextView)findViewById(R.id.pain_record_time_textView)).setText(painSurveyResponse.getDate().toString());
        } else {
            findViewById(R.id.pain_record_linearLayout).setVisibility(View.GONE);
        }
    }

}
