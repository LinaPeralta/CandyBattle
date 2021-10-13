package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button conectarBtn;
    private EditText nombreTxt;
    private EditText ipTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conectarBtn = findViewById(R.id.conectarBtn);
        nombreTxt = findViewById(R.id.nombreTxt);
        ipTxt = findViewById(R.id.ipTxt);



        conectarBtn.setOnClickListener(
                (v) -> {



                });



    }



}