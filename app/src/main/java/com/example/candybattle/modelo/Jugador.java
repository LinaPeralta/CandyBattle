package com.example.candybattle.modelo;

import java.util.ArrayList;

public class Jugador {
    private int x,y;
    private String accion; //lo que hace el jugador
    private int velocidad; //velocidad de movimiento
    private ArrayList<Bala> balas;

    public Jugador (int x, int y, String accion) {
        this.x = x;
        this.y=y;
        this.velocidad = 30;
        this.accion = accion;
        //array
        balas = new ArrayList <>();

    }

    public Jugador () {
    }

    public void moverJugador() {
        switch (accion) {
            case "Izquierda":
                x-=velocidad;
                break;
            case "Derecha":
                x+=velocidad;
                break;
            case "Disparo":
                crearBalita();
                System.out.println("disparo");
            case "quieto nene":
                System.out.println("no me muevo jiji");
                break;
        }

    }




    private void crearBalita() {

        Bala bala = new Bala(x, y);
        balas.add(bala);



    }

    public void eliminarBalita() {
        for (int i = 0; i < balas.size(); i++) {
            if (balas.get(i).getY() < 0) {
                balas.remove(i);
            }
        }
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
