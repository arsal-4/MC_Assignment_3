package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resView = findViewById(R.id.result);

        String txt = getIntent().getStringExtra("key");

        resView.setText("Your Score is " + txt + " out of 5");
    }

    public void share(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String txt = getIntent().getStringExtra("key");
        String value = "Your Score is " + txt + " out of 5";
        intent.putExtra(Intent.EXTRA_TEXT, value);
        startActivity(Intent.createChooser(intent, "Share via"));
    }
}