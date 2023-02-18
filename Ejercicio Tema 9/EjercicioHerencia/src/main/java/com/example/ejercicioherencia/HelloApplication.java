package com.example.ejercicioherencia;



public class HelloApplication {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Harold Barrios Coffi";
        cliente.edad = 42;
        cliente.telefonoMovil = 127260808;
        cliente.credito = -1583.71;

        System.out.println( "Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("NºMovil: " + cliente.telefonoMovil);
        System.out.println("Credito $: " + cliente.credito);
    }

}

class Persona {
    String nombre;
    int edad;
    int telefonoMovil;
}

class Cliente extends Persona {
    double credito;
}
