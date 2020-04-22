package com.example.recoverytracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PAMActivity extends AppCompatActivity {

    private PAMResponse pamResponse = PAMResponse.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pam);
        pamResponse.clear();
    }

    public void onSelectImage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        switch (view.getId()) {
            case R.id.afraidImageView:
                pamResponse.setImageID(R.drawable.afraid);
                break;
            case R.id.angryImageView:
                pamResponse.setImageID(R.drawable.angry);
                break;
            case R.id.calmImageView:
                pamResponse.setImageID(R.drawable.calm);
                break;
            case R.id.delightedImageView:
                pamResponse.setImageID(R.drawable.delighted);
                break;
            case R.id.excitedImageView:
                pamResponse.setImageID(R.drawable.excited);
                break;
            case R.id.frustratedImageView:
                pamResponse.setImageID(R.drawable.frustrated);
                break;
            case R.id.gladImageView:
                pamResponse.setImageID(R.drawable.glad);
                break;
            case R.id.gloomyImageView:
                pamResponse.setImageID(R.drawable.gloomy);
                break;
            case R.id.happyImageView:
                pamResponse.setImageID(R.drawable.happy);
                break;
            case R.id.miserableImageView:
                pamResponse.setImageID(R.drawable.miserable);
                break;
            case R.id.sadImageView:
                pamResponse.setImageID(R.drawable.sad);
                break;
            case R.id.satisfiedImageView:
                pamResponse.setImageID(R.drawable.satisfied);
                break;
            case R.id.sereneImageView:
                pamResponse.setImageID(R.drawable.serene);
                break;
            case R.id.sleepyImageView:
                pamResponse.setImageID(R.drawable.sleepy);
                break;
            case R.id.tenseImageView:
                pamResponse.setImageID(R.drawable.tense);
                break;
            case R.id.tiredImageView:
                pamResponse.setImageID(R.drawable.tired);
                break;
            default:
                break;
        }
    }
}
