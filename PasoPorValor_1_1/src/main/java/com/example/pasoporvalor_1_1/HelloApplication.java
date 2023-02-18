package com.example.pasoporvalor_1_1;

// Paso por "Valor"

public class HelloApplication {

    public static void main(String[] args) {
    int valA = 5;       // int = 32 bits, = 4 bytes
    int valB = 10;      // int = 32 bits, = 4 bytes

    suma(valA, valB);   // +8 bytes = 16bytes        // Invocacion de Funcion "Suma" + asigna parametros "valA" y "valB"
    // La Gran desventaja del paso por "Valor" es que duplica la capacidad de memoria (int original = 8 bytes + la
    // Funcion "suma" valA y valB = 8 bytes, danto un total de "16 bytes".

    System.out.println(valA);
    System.out.println(valB);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
