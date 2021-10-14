package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Conexion extends AppCompatActivity {

    private Button conectarBtn;
    private EditText nombreTxt;
    private EditText ipTxt;
    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion);

        conectarBtn = findViewById(R.id.conectarBtn);
        nombreTxt = findViewById(R.id.nombreTxt);
        ipTxt = findViewById(R.id.ipTxt);

        tcp= TCPSingleton.getInstance();



        conectarBtn.setOnClickListener(
                (v) -> {

                    tcp.enviarMensaje("a la conexion bruno");
                    Intent conexion = new Intent( this, Control.class);
                    startActivity(conexion);

                });
    }
}