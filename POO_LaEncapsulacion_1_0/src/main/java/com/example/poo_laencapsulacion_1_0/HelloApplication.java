package com.example.poo_laencapsulacion_1_0;

// La Encapsulacion

public class HelloApplication {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("Coche");           // Para acceder al "Private" debe pasarlo a traves del "Seter" = "setTipo";
        System.out.println(vehiculo.getTipo());  // Para imprimir, debe ser con el "Geter";
    }
}
class Vehiculo {
    private String tipo; // Variable|Propiedad de la clase "tipo"

    // en los "Set" el nombre de la variable debe iniciar siempre en MAY = "setTipo";
    public void setTipo(String tipo) { // Los "Seters" fijan el valor, no devuelve nada "void" + usan el tipo de dato de
        this.tipo = tipo;              // la propiedad "String";
    }

    public String getTipo() { // Los "Geters" devuelven valor "String", no tiene parametros xq no modifica nada "()";
        return this.tipo;     // Los "Geters" obtienen informacion como la "Propiedad" = "this.tipo;";
    }
}