package com.example.poo_laencapsulacion_1_2;

// La Encapsulacion #3
public class HelloApplication {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");             // Propiedad
        coche.setVelocidadMaxima(120);      // Propiedad
        coche.setRapido(true);              // Propiedad

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");            // Propiedad
        moto.setVelocidadMaxima(60);        // Propiedad
        moto.setRapido(false);              // Propiedad

        System.out.println(coche.getTipo());                      // Impresion Detallada
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        System.out.print(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido()); //Impresion Simplificada
    }
}
class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isRapido() {    // Solo con "boolean" se usa "is" y no "get"
        return this.rapido;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setTipo(String tipo) {    // "Set" es cambiar un valor
        this.tipo = tipo;
    }

    public String getTipo() {             // "Get" es obtener un valor
        return this.tipo;
    }
}