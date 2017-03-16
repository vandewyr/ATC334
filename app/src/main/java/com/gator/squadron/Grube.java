package com.gator.squadron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Grube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grube);
    }

    public void nextActivity(View view){
        Intent intent = new Intent(this, TowerChapterOne.class);
        startActivity(intent);
    }
}
