package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tView;
    Button btn;

    public static String PACKAGE_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tView = findViewById(R.id.result);
        btn = findViewById(R.id.share);

        PACKAGE_NAME = getApplicationContext().getPackageName();

        String txt = getIntent().getExtras().getString("key");

        tView.setText("Your Score is " + txt + " out of 5");

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                share();
            }
        });
    }

    private void share() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String value = "https://play.google.com/store/apps/details?id=" + PACKAGE_NAME;
        intent.putExtra(Intent.EXTRA_TEXT, value);
        startActivity(Intent.createChooser(intent, "Share via"));
    }

}