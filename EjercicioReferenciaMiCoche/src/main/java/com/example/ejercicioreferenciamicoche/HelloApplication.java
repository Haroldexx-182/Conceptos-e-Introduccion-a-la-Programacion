package com.example.ejercicioreferenciamicoche;

public class HelloApplication {

    public void main(String[] args) {
        Rubicon MiCoche = new Rubicon();
        MiCoche.QuitarPuerta();
        MiCoche.QuitarPuerta();
        System.out.println(MiCoche.Puertas);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
class Rubicon {
    public int Puertas = 2;

    public void QuitarPuerta() {
        this.Puertas--;
    }
}
