package com.example.pasoporreferencia_1_1;

// Paso por "Referencia"

public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();           // Aqui se reserva la memoria
        cocheChanger(coche);                 // Paso por referencia para manipilar la memoria (no copia=Duplica memoria)
        cocheChanger(coche);

        System.out.println(coche.velocidad);
    }

    public static void cocheChanger (Coche coche){
       coche.velocidad += coche.velocidad + 50;      // Forma Larga de escribir el codigo
     //coche.velocidad += 50;                        // Forma "Corta" de escribir el codigo
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}

interface Vehiculo {
        int velocidad = 0;
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