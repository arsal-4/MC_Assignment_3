package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tView = findViewById(R.id.result);

        String txt = getIntent().getExtras().getString("key");

        tView.setText("Your Score is " + txt + " out of 5");
    }
}