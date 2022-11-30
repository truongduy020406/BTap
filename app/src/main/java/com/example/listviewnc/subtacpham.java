package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class subtacpham extends AppCompatActivity {
    TextView tv,nd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtacpham);
        tv = findViewById(R.id.tacphamne);
        Intent myintent = getIntent();
        String name = myintent.getStringExtra("nd");
        tv.setText(name);

    }
}