package com.example.poppups;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img_main;
    TextView txt_jhon,txt_victor,txt_daniel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_main=findViewById(R.id.pudge);
        txt_jhon=findViewById(R.id.txt_victor);
        txt_daniel=findViewById(R.id.txt_daniel);
        txt_victor=findViewById(R.id.txt_victor);

        img_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           startActivity(new Intent(MainActivity.this,InfoPopup.class));
            }
        });
        txt_jhon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,PopupJhon.class));

            }
        });
        txt_victor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PopupVictor.class));

            }
        });
        txt_daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,PopupDaniel.class));

            }
        });

    }
}
