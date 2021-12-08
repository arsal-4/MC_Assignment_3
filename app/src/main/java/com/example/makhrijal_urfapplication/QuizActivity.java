package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    int i = 0, count = 0;
    TextView txt, txt2;
    RadioGroup rg;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        txt = findViewById(R.id.queNo);
        txt2 = findViewById(R.id.queSt);

        rg = findViewById(R.id.rg);

        txt.setText("Q. No. " + Integer.toString(i+1));
        txt2.setText(que.get(i));

        for (int index = 0; index < rg.getChildCount(); index++) {
            ((RadioButton) rg.getChildAt(index)).setText(options.get(index));
        }
    }

    List<String> que= Arrays.asList("Select the articulation point of the letter ب", "Select the articulation point of the letter د", "Select the articulation point of the letter ع","Select the articulation point of the letter ن", "Select the articulation point of the letter ق");
    List<String> options= Arrays.asList("LIPS","MOUTH", "NOSE","THROAT", "TONGUE");
    List<String> ans= Arrays.asList("LIPS", "TONGUE", "TONGUE", "NOSE", "TONGUE");

    public void nextButton(View view){

        txt = findViewById(R.id.queNo);
        txt2 = findViewById(R.id.queSt);

        rg = findViewById(R.id.rg);
        int selectedId = rg.getCheckedRadioButtonId();

        if(selectedId != -1){

            RadioButton btn = findViewById(selectedId);

            if(ans.get(i).equals(btn.getText().toString())){
                count++;
            }

            i++;

            if(i >= 5){
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("key", String.valueOf(count));
                startActivity(intent);
            }
            else {
                rg.clearCheck();

                txt.setText("Q. No. " + Integer.toString(i + 1));
                txt2.setText(que.get(i));

                for (int index = 0; index < rg.getChildCount(); index++) {
                    ((RadioButton) rg.getChildAt(index)).setText(options.get(index));
                }
            }
        }
    }
}