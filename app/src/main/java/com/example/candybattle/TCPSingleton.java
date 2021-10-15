package com.example.candybattle;

import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TCPSingleton extends Thread {

    private static TCPSingleton unicainstancia;


    public static TCPSingleton getInstance() {
        if (unicainstancia == null) {
            unicainstancia = new TCPSingleton();
            unicainstancia.start();
        }
        return unicainstancia;
    }

    private TCPSingleton() {

    }

    BufferedWriter writer;
    BufferedReader reader;
    private Socket socket;


    private OnMessageListener observer;


    public  void setObserver(OnMessageListener observer){
        this.observer= observer;
    }

    @Override
    public void run() {
        new Thread(
                () -> {
                    try {
                        socket = new Socket("192.168.0.252", 5000);

                        InputStream is = socket.getInputStream();
                        OutputStream out = socket.getOutputStream();

                        reader = new BufferedReader(new InputStreamReader(is));
                        writer = new BufferedWriter(new OutputStreamWriter(out));

                        while (true) {

                            String line = reader.readLine();
                            Log.e(">>>", line);


                            observer.notificarMensaje(line);

                        }


                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }


        ).start();


    }

    public void enviarMensaje(String msj) {

        new Thread(
                () -> {
                    try {
                        writer.write(msj + "\n");
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

        ).start();

    }

    public void recibirMensaje() {
        new Thread(
                () -> {
                    while(true) {
                        try {
                            String msj = reader.readLine();
                            observer.notificarMensaje(msj);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
    }

    public OnMessageListener getObserver() {
        return observer;
    }

}
