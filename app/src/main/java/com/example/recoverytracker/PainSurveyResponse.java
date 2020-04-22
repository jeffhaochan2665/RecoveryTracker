package com.example.recoverytracker;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PainSurveyResponse {

    private Map<PainSurveyQuestions, PainDescriptor> responses = new HashMap();
    private Date date;

    private static final PainSurveyResponse PAIN_SURVEY_RESPONSE = new PainSurveyResponse();
    public static PainSurveyResponse getInstance() { return PainSurveyResponse.PAIN_SURVEY_RESPONSE; }

    public void updateResponse(PainSurveyQuestions question, PainDescriptor descriptor) {
        responses.put(question, descriptor);
        date = new Date();
    }

    public PainDescriptor getResponse(PainSurveyQuestions question) {
        return responses.get(question);
    }

    public boolean isComplete() {
        return responses.size() == PainSurveyQuestions.values().length;
    }

    public void clear() {
        responses.clear();
    }

    public Date getDate() { return date; }
}
