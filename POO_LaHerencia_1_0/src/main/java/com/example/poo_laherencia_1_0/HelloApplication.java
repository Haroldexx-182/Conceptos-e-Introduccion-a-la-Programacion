package com.example.poo_laherencia_1_0;

// "La Herencia"
public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 14;          // La Clase "Coche" (Hija1) esta vacia, pero estoy heredando una de las
        coche.matricula = "ABC 123";         // propiedades de la Clase "Vehiculo" (Padre), como es "velocidadMaxima".-

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 50;     // La Clase "CocheElectrico" (Hija2), sigue igual de vacia, pero
        cocheElectrico.matricula = "ZXQ 987";    // "Hereda" todo de la clase "Padre"

        System.out.println(cocheElectrico.compruebaMatricula("XXX"));
    }
}

class Vehiculo {                // Clase "Padre"
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }

             return false;
    }
}

    class Coche extends Vehiculo {        // Clase "Hija1" (Clase VACIA)

    }

        class CocheElectrico extends Coche {        // Clase "Hija2" (Clase VACIA)

        }