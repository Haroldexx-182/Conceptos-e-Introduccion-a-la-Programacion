package com.example.funcion_recursiva_1_1;

// Funcion "Recursiva" #2

public class HelloApplication {

    public static void main(String[] args) {


        factorial(8);                     // Valor Factorial
    }

    public static int factorial(int numero) {     //Factorial "Recursivo" (habitualmente siempre guarda resultado en memoria)
        int resultado;
        if (numero == 1) {                        // Condicion
            return 1;                             // "return" detiene la Recursividad, cuando cumple la Condicion
        }

        resultado = factorial(numero - 1) * numero;   // Mientras no llega la "Condicion", sigue la recursividad
        return resultado;                                     // hasta que se cumpla la "Condicion".
    }

    public static int factorialNR(int numero) {     // Factorial "Iterativo" (No Recursivo)
        int temp;
        int resultado = 1;

        for (temp = 1; temp <= numero; temp++) {
            resultado = resultado * temp;
        }

        return resultado;
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