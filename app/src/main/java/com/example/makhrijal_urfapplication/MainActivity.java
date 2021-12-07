package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn, btn2, btn3;
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(getApplicationContext(),"Search", Toast.LENGTH_LONG).show();
                break;
            case R.id.action_learn:
                Intent intent_learn = new Intent(this, LearnActivity.class);
                startActivity(intent_learn);
                break;
            case R.id.action_quiz:
                Intent intent_quiz = new Intent(this, QuizActivity.class);
                startActivity(intent_quiz);
                break;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }

    private void openRepoLink(String s) {
        Uri uri = Uri.parse(s);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
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