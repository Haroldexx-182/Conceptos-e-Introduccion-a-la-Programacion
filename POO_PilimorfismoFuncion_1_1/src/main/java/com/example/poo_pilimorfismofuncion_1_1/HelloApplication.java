package com.example.poo_pilimorfismofuncion_1_1;

// Funcion "Polimorfica"
// Una misma funcion en dos clases hacen cosas distintas | Una misma funcion, implementada de diferentes formas, siempre
// y cuando tenga el mismo nombre, en una misma clase, hace cosa distintas tambien (Sobreescritura de metodos).-

public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.sumaNumeros((float)3.5, (float)5.2);
    }
}

class Vehiculo {
    int velocidadMaxima;

    public void diHola() {
        System.out.println("Hola!!!");
    }
}

class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un Coche");
    }

    public int sumaNumeros(int a, int b) {
        System.out.println("Soy el suma numeros de INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b) {
        System.out.println("Soy el suma numeros de FLOAT");
        return a + b* (float)9.0;
    }

    public void sumaNumeros(double a, double b) {                // "double" es el tipo de dato perfecto para decimales
        System.out.println("Soy el suma numeros de DOUBLE");
        System.out.println("El resultados es: " + (a + b));
    }
}
