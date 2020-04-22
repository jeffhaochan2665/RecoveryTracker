package com.example.recoverytracker;

public enum PAMEmotions {

    AFRAID (R.drawable.afraid),
    ANGRY (R.drawable.angry),
    CALM (R.drawable.calm),
    DELIGHTED (R.drawable.delighted),
    EXCITED (R.drawable.excited),
    FRUSTRATED (R.drawable.frustrated),
    GLAD (R.drawable.glad),
    GLOOMY (R.drawable.gloomy),
    HAPPY (R.drawable.happy),
    MISERABLE (R.drawable.miserable),
    SAD (R.drawable.sad),
    SATISFIED (R.drawable.satisfied),
    SERENE (R.drawable.serene),
    SLEEPY (R.drawable.sleepy),
    TENSE (R.drawable.tense),
    TIRED (R.drawable.tired);

    private int imageID;

    PAMEmotions(int imageID) {
        this.imageID = imageID;
    }
}
