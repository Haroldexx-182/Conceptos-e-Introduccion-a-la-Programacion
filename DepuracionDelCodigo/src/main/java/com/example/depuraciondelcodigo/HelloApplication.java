package com.example.depuraciondelcodigo;

public class HelloApplication {

    public static void main(String[] args) {
        int suma = 0;

        suma = suma + 15;         // BreakPoint | Punto de Ruptura (Punto Rojo)

        System.out.println(suma); // WatchPoint | Punto de Seguimiento (Se Detiene cuando se cumpla una condicion)
    }
}
