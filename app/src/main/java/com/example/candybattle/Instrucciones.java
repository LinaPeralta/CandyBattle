package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Instrucciones extends AppCompatActivity {

    private Button OkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);

        OkBtn = findViewById(R.id.OkBtn);


        OkBtn.setOnClickListener(
                (v) -> {

                    Intent instrucciones = new Intent( this, Conexion.class);
                    startActivity(instrucciones);

                });

    }
}