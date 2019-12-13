package com.example.poppups;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class InfoPopup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_popup);


        DisplayMetrics medidaVentana=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidaVentana);
        int alto=medidaVentana.widthPixels;
        int ancho=medidaVentana.heightPixels;
        getWindow().setLayout((int)(ancho*2.50),(int)(alto*5.5));

    }
}
