package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button jugarBtn;
    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugarBtn = findViewById(R.id.jugarBtn);
        tcp= TCPSingleton.getInstance();


        jugarBtn.setOnClickListener(
                (v) -> {

                    tcp.enviarMensaje("y de que va esto?");
                    Intent main = new Intent( this, Instrucciones.class);
                    startActivity(main);

                });

    }



}