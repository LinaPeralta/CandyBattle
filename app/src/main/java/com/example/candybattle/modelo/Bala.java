package com.example.candybattle.modelo;

public class Bala {
    private int x, y, velocidad;
    private boolean disparo;

    public Bala (int x, int y) {
        this.x = x;
        this.y = y;
        this.velocidad = 5;
        this.disparo = true;
    }

    //movimiento bala
    public void moveBullet() {
        y-=velocidad;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isDisparo() {
        return disparo;
    }

    public void setDisparo(boolean disparo) {
        this.disparo = disparo;
    }
}
