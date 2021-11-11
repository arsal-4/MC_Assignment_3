package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

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
    List<String> selAns= Arrays.asList(".",".", ".",".", ".");
    List<String> ans= Arrays.asList("LIPS", "TONGUE", "TONGUE", "NOSE", "TONGUE");

    public void nextButton(View view){
        i++;

        txt = findViewById(R.id.queNo);
        txt2 = findViewById(R.id.queSt);

        rg = findViewById(R.id.rg);
        rg.clearCheck();

        txt.setText("Q. No. " + Integer.toString(i+1));
        txt2.setText(que.get(i));

        for (int index = 0; index < rg.getChildCount(); index++) {
            ((RadioButton) rg.getChildAt(index)).setText(options.get(index));
        }

        for(int i = 0; i < 5; i++){
            if(selAns.get(i).equals(ans.get(i))){
                count++;
            }
        }

        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("key", Integer.toString(count));
        startActivity(i);

    }

    public void onClickRadio(View view){
        RadioGroup rg = findViewById(R.id.rg);
        int selectedId = rg.getCheckedRadioButtonId();
        RadioButton btn = findViewById(selectedId);
        selAns.set(i,btn.getText().toString());
    }

}