package com.example.candybattle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.candybattle.modelo.Jugador;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnMessageListener {

    private Button balaBtn;
    private Button izqBtn;
    private Button derechaBtn;

    private TextView puntajeTxt;

    private TCPSingleton tcp;

    Jugador jugador;

    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        balaBtn = findViewById(R.id.balaBtn);
        izqBtn = findViewById(R.id.izqBtn);
        derechaBtn = findViewById(R.id.derechaBtn);

        puntajeTxt= findViewById(R.id.puntajeTxt);

        tcp= TCPSingleton.getInstance();
        tcp.setObserver(this);

        jugador =  new Jugador();

        gson = new Gson();

        balaBtn.setOnClickListener(this);
        izqBtn.setOnClickListener(this);
        derechaBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.balaBtn:
                //tcp.enviarMensaje("jajaj te balie");
                jugador.setAccion("Disparo");
                String json = gson.toJson(jugador);
                tcp.enviarMensaje(json);

                break;

            case R.id.izqBtn:
                //tcp.enviarMensaje("atrapame voy a la izquierda");
                jugador.setAccion("Izquierda");
                String jsonIz = gson.toJson(jugador);
                tcp.enviarMensaje(jsonIz);

                break;

            case R.id.derechaBtn:
                //tcp.enviarMensaje("soy rapido a la derecha nene");
                jugador.setAccion("Derecha");
                String jsonDr = gson.toJson(jugador);
                tcp.enviarMensaje(jsonDr);

                break;
        }

    }

    @Override
    public void notificarMensaje(String msj) {

        runOnUiThread(()->{
            Toast.makeText(this, msj, Toast.LENGTH_SHORT).show();
            puntajeTxt.setText(msj);
        });
    }


}