package com.example.poo_laencapsulacion_1_1;

// La Encapsulacion #2

public class HelloApplication {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coupe");             // Propiedad

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");            // Propiedad

        System.out.println(coche.getTipo());
        System.out.print(moto.getTipo());
    }
}
class Vehiculo {
    private String tipo;


    public void setTipo(String tipo) {    // "Set" es cambiar un valor
        this.tipo = tipo;
    }

    public String getTipo() {             // "Get" es obtener un valor
        return this.tipo;
    }
}