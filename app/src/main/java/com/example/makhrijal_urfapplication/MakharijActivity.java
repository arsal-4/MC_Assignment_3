package com.example.makhrijal_urfapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.List;

public class MakharijActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makharij);

        String text = getIntent().getStringExtra("EXTRA_MESSAGE");
        List<String> mkj= Arrays.asList("Makharij # 1, 2","Makharij # 4, 5", "Makharij # 6, 7","Makharij # 8, 9, 10","Makharij # 11","Makharij # 12", "Makharij # 13","Makharij # 14", "Makharij # 15, 16", "Makharij # 17");
        List<String> img= Arrays.asList("mk123","mk45", "mk67","mk8910","mk11","mk12", "mk13","mk14", "mk1516", "mk17");
        String uri;
        if (text == null)
             uri = "@drawable/mk123";
        else
            uri = "@drawable/"+img.get(mkj.indexOf(text));

        ImageView imageView = findViewById(R.id.imageView2);
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
    }


}