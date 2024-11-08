package com.example.medecalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity1 extends AppCompatActivity {

    paseMockUp pase33 = new paseMockUp();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ListView listView = findViewById(R.id.listView);
        ImageView imageView90=findViewById(R.id.imageView6);
        TextView textView=findViewById(R.id.textView4);

        ArrayAdapter<Pase> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pase33.pase);
        listView.setAdapter(adapter);


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent intent = new Intent(activity1.this, activity2.class);
                    startActivity(intent);
                }

                else if (position == 1) {
                    Intent intent = new Intent(activity1.this, activity3.class);
                    startActivity(intent);
                }

                else if (position == 2) {
                    Intent intent = new Intent(activity1.this, activity4.class);
                    startActivity(intent);
                }
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}