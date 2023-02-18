package com.example.funcion_recursiva_1_2;

// Funcion "Recursiva" #3

public class HelloApplication {

    public static void main(String[] args) {
        suma(10, 20);
    }

    public static void suma(int a, int b) {
        var temp = a + b;
        System.out.println("A vale " + a + "B vale " + b + "Temp vale " + temp);

        if (b >= 90) {                // Condicion (Sentencia de Control)
            return;                   // El STOP de la repercusion (Sentencia de Control);
        }

        suma(a, temp);                // Recursividad
    }
}
