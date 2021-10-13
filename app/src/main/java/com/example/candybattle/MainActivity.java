package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button jugarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugarBtn = findViewById(R.id.jugarBtn);


        jugarBtn.setOnClickListener(
                (v) -> {

                    Intent main = new Intent( this, Instrucciones.class);
                    startActivity(main);

                });

    }



}