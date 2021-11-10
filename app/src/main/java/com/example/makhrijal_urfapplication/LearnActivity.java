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

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        btn = findViewById(R.id.mk123);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMakharijActivity();
            }
        });

    }

    private void openMakharijActivity() {
        Intent intent = new Intent(this, MakharijActivity.class);
        startActivity(intent);
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