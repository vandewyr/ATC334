package com.gator.squadron;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashScreen extends AppCompatActivity {

    MediaPlayer growlSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        growlSound = MediaPlayer.create(this, R.raw.growl2);
        growlSound.start();

        ImageView splashImage = (ImageView)findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fadein);
        splashImage.startAnimation(animation1);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                nextActivity();
            }

        }, 3200L);
    }

    public void nextActivity(){
        Intent intent = new Intent(this, RetrievePdf.class);
        startActivity(intent);
    }
}
