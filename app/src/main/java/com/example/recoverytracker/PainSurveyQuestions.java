package com.example.recoverytracker;

public enum PainSurveyQuestions {

    Q1 ("Which word describes your pain right now?"),
    Q2 ("Which word describes it at its worst?"),
    Q3 ("Which word describes it when it is least?");

    public final String question;

    PainSurveyQuestions(String question) {
        this.question = question;
    }
}
