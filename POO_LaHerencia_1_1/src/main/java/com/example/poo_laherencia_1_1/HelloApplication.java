package com.example.poo_laherencia_1_1;

// "La Herencia" (No heredar a otras clases)
public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 14;
        coche.matricula = "ABC 123";

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 50;
        cocheElectrico.matricula = "ZXQ 987";

        System.out.println(cocheElectrico.compruebaMatricula("XXX"));
    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
            return false;
    }
}

    final class Coche extends Vehiculo {        // No heredar a otras clases "Final"
    }

        class CocheElectrico extends Coche {
        }