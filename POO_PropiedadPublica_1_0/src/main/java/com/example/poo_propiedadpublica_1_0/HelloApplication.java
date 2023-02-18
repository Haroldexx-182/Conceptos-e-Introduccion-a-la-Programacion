package com.example.poo_propiedadpublica_1_0;

// PRIVACIDAD: "Propiedades Publicas"
public class HelloApplication {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);
    }
}
class Vehiculo {
    public String tipo;  //Propiedad Publica "public" (no es necesario escribir "public", ejecuta igual.-
    }