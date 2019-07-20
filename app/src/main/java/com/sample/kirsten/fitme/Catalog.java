package com.sample.kirsten.fitme;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Catalog extends AppCompatActivity {
    private ImageView plsClick1;
    private ImageView plsClick2;
    private ImageView plsClick3;
    private ImageView plsClick4;
    private ImageView plsClick5;
    private ImageView plsClick6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        plsClick1 = (ImageView)findViewById(R.id.imageView13);
        plsClick2 = (ImageView)findViewById(R.id.imageView12);
        plsClick3 = (ImageView)findViewById(R.id.imageView15);
        plsClick4 = (ImageView)findViewById(R.id.imageView11);
        plsClick5 = (ImageView)findViewById(R.id.imageView10);
        plsClick6 = (ImageView)findViewById(R.id.imageView14);

        plsClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img1.class));
            }
        });

        plsClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img2.class));
            }
        });

        plsClick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img3.class));
            }
        });

        plsClick4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img4.class));
            }
        });
        plsClick5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img5.class));
            }
        });
        plsClick6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Catalog.this, Img6.class));
            }
        });

    }
}
