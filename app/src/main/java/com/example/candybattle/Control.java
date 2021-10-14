package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Control extends AppCompatActivity implements View.OnClickListener, OnMessageListener {

    private Button balaBtn;
    private Button izqBtn;
    private Button derechaBtn;

    private TCPSingleton tcp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        balaBtn = findViewById(R.id.balaBtn);
        izqBtn = findViewById(R.id.izqBtn);
        derechaBtn = findViewById(R.id.derechaBtn);

        tcp= TCPSingleton.getInstance();
        tcp.setObserver(this);


        balaBtn.setOnClickListener(this);
        izqBtn.setOnClickListener(this);
        derechaBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.balaBtn:

                tcp.enviarMensaje("jajaj te balie");
                break;

            case R.id.izqBtn:

                tcp.enviarMensaje("atrapame voy a la izquierda");
                break;

            case R.id.derechaBtn:
                tcp.enviarMensaje("soy rapido a la derecha nene");
                break;
        }

    }

    @Override
    public void notificarMensaje(String msj) {

    }
}