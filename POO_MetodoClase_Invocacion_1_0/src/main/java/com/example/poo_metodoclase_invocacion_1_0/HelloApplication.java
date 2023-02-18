package com.example.poo_metodoclase_invocacion_1_0;

// Metodo de Clase y su Invocacion

public class HelloApplication {

    public static void main(String [] args){
        Coche coche = new Coche();                  // Crear instancia de la Clase (Cuando el metodo esta en otra clase)

    //"Nombre_Clase"."Metodo""(Parametros);"
        coche.Acelerar(50);            // Invocacion del "Metodo" de otra clase

        var resultado = suma(2, 5);  // Invocacion del "Metodo" que esta en la misma clase (Class Main)
        System.out.println(resultado);
       }

       public static int suma(int operandoA, int operandoB) {  // cuando es una funcion de mi propia clase, no se invoca
        return operandoA + operandoB;
       }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {

// "Visibilidad" + "No devuelve nada" + "Nombre_Metodo"("Parametro") + "Cuerpo que intrucciones"
    public void Acelerar(int cuantaVelocidad) {       // Metodo o funcion #1
    }
    public void Frenar(int cuantaVelocidad) {         // Metodo o Funcion #2
    }
}