package com.example.poo_interfaces_1_0;

// Las "Interfaces" (Nos indica que funciones tenemos que cumplir)
// Todas las clases que implementen la interfacaz, oblicatoriamente deben tener las funciones mencionadas en la
// interfaz, como minimo, y el programador tiene que implementar en la (s) clase (s).
public class HelloApplication {

    public static void main(String[] args) {
    }
}

interface Vehiculo {                                    // "Interfaz"
    void Acelerar(int cuantaVelocidad);                 // Indicacion de Funciones (no da nada hecho)
    void Frenar(int cuantaVelocidad);                   // Indicacion de Funciones (no da nada hecho)
}

class Coche implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {         // implementacion de Metodo indicado en la "interface"
    }

    public void Frenar(int cuantaVelocidad) {           // implementacion de Metodo indicado en la "interface"
    }
}
