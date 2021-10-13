package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Control extends AppCompatActivity {

    private Button balaBtn;
    private Button izqBtn;
    private Button derechaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        balaBtn = findViewById(R.id.balaBtn);
        izqBtn = findViewById(R.id.izqBtn);
        derechaBtn = findViewById(R.id.derechaBtn);

    }
}