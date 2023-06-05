package com.example.quranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        t1 = findViewById(R.id.text);
        t2 = findViewById(R.id.txt1);

        Intent intent = getIntent();
        int ayatnumber = intent.getIntExtra("number", 0);
        t1.setText("Ayat number: " +String.valueOf(ayatnumber));
        String ayat = intent.getStringExtra("ayat");
        t2.setText(ayat);
    }
}