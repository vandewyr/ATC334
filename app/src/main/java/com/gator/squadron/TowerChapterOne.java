package com.gator.squadron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TowerChapterOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower_chapter_one);

        long t = (long)15000;
        ImageView f22 = (ImageView)findViewById(R.id.f22Image);
        proceedDownwind(f22);
            //f22.animate().rotation(180);

    }

    public void proceedDownwind(ImageView aircraft){
        float x = (float)700;
        float y = (float)150;
        float negX = (float)-140;
        long t = (long)15000;
        float enterDownwind = (float)180;

        aircraft.animate().yBy(y).setDuration(t);
        aircraft.animate().translationXBy(negX).setDuration(t);
    }
}
