package com.gator.squadron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class tower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower);

        WebView towerView = (WebView)findViewById(R.id.webViewTower);
        towerView.loadUrl("http://www.leconcombre.com/board/dl/us/downloadflas1us.html");
        //setContentView(towerView);

    }
}
