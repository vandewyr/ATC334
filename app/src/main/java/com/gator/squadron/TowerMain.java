package com.gator.squadron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TowerMain extends AppCompatActivity {

    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower_main);
        list = (ListView) findViewById(R.id.chapterList);

        ArrayList<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");
        chapters.add("Chapter 3");
        chapters.add("Chapter 4");
        chapters.add("Chapter 5");
        chapters.add("Chapter 6");
        chapters.add("Chapter 7");
        chapters.add("Chapter 8");
        chapters.add("Chapter 9");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chapters);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    final int position, long id) {

                String nunya = (String)adapter.getItemAtPostion(position);
                if(list.getSelectedItem().equals(nunya)){
                    System.out.println("EMPTY");
                }else{
                    System.out.println("THIS WAS SELECTED:   "+list.getSelectedItem().toString());
                }
            }
        });
    }

    public void grubeActivity(View view){
        Intent intent = new Intent(this, Grube.class);
        startActivity(intent);
    }
}
