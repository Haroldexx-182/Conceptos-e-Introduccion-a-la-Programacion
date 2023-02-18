package com.example.poo_laabstraccion_1_0;

// La Abstraccion
public class HelloApplication {
    public static void main(String[] args) {

    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    abstract public void setSonido(String sonido);   // Los Abstracts no pueden tener un Body "{}"
    abstract public String getSonido();              // Los Abstracts no pueden tener un Body "{}"

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setTipo(String sonido) {
        this.sonido = sonido;
    }
    public String getTipo () {
        return this.tipo;
    }
}
