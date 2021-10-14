package com.example.candybattle.modelo;

import java.util.ArrayList;

public class Jugador {
    private int x;
    private String accion; //lo que hace el jugador
    private int velocidad; //velocidad de movimiento
    private ArrayList<Bala> balitas;

    public Jugador (int x, int y, String accion) {
        this.x = x;
        this.velocidad = 20;
        this.accion= accion;

        //balitas array
        balitas = new ArrayList <>();
    }

    public Jugador() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
