package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

    }

    public void makharijButton(View view) {
        int id = view.getId();
        Button btn = (Button)findViewById(id);
        String text = btn.getText().toString();

        Intent intent = new Intent(this, MakharijActivity.class);

        intent.putExtra("EXTRA_MESSAGE", text);
        startActivity(intent);
    }
    
}