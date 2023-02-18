package com.example.ejercicioherencia_2;

// Ejercicio Tema 9 #2

public class HelloApplication {

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Thiago Barrios";
        trabajador.edad = 21;
        trabajador.telefonoMovil = 5917576;
        trabajador.salario = -1247.98;

        System.out.println( "Nombre y Apellido: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nº de Movil: " + trabajador.telefonoMovil);
        System.out.println("Salario Semanal $: " + trabajador.salario);
    }
}

class Persona {
    String nombre;
    int edad;
    int telefonoMovil;
}

class Trabajador extends Persona {
    double salario;
}

