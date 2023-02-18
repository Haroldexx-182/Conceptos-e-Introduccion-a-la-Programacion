package com.example.poo_propiedadprivada_1_0;

//PRIVACIDAD: "Propiedad Privada"

public class HelloApplication {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.tipo = "Coche";                // El Editor ya de dio cuenta de la privacidad, lo coloco en rojo
        System.out.println(vehiculo.tipo);      // El Editor ya de dio cuenta de la privacidad, lo coloco en rojo
    }
}
class Vehiculo {
    private String tipo;  //Propiedad Privada "private"
}