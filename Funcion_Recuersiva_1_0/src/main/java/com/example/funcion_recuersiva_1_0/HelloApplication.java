package com.example.funcion_recuersiva_1_0;

// Funcion Recursiva
public class HelloApplication {

    public static void main(String[] args) {
        suma(1, 2);
            }


    public static int suma(int a, int b) {
        int resultado = a + b;
        System.out.println(resultado);

        return suma(a, resultado);     // Funcion "Recursiva", se llama asi misma de manera indefinida, si no se
                                       // proporciona una condicion de salida clara.-
    }
}

