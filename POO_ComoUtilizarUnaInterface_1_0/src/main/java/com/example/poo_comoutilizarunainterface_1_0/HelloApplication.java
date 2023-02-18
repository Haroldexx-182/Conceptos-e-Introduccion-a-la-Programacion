package com.example.poo_comoutilizarunainterface_1_0;

// Como Utilizar una Interfaz

public class HelloApplication {

    public static void main(String [] args){
        Coche coche = new Coche();
        Moto moto = new Moto();

        EjecutaAcelerar(coche);
        EjecutaAcelerar(moto);
    }

    public static void EjecutaAcelerar(Vehiculo vehiculo) {
        vehiculo.Acelerar(15);
    }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Coche() -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() -> Frenar()");
    }
}

class Moto implements Vehiculo {
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("Moto() -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto() -> Frenar()");
    }
}