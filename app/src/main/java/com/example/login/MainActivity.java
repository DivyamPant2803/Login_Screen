package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        constraintLayout = findViewById(R.id.constraintLayout);
        animationDrawable = (AnimationDrawable) constraintLayout.getBackground();

        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(1000);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        if(animationDrawable !=null && !animationDrawable.isRunning()){
            animationDrawable.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(animationDrawable !=null && animationDrawable.isRunning()){
            animationDrawable.stop();
        }
    }
}
