package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.repoLink);
        btn2 = findViewById(R.id.learn);
        btn3 = findViewById(R.id.quiz);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRepoLink("https://github.com/arsal-4/MC_Assignment_3");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLearnActivity();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuizActivity();
            }
        });
    }

    private void openRepoLink(String s) {
    }

    private void openLearnActivity() {
        Intent intent = new Intent(this, LearnActivity.class);
        startActivity(intent);
    }

    private void openQuizActivity() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

}