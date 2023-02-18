package com.example.poo_polimorfismo_1_0;

// "Polimorfismo"
public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();                 // Instancia de clase "Hija"
        coche.diHola();
    }
}

class Vehiculo {
    int velocidadMaxima;

    public void diHola() {
        System.out.println("Hola!!!");            // Metodo de la clase "Padre"
    }
}

class Coche extends Vehiculo {
    public void diHola() {
        System.out.println("Soy un Coche");       // "Polimorfismo": sobreescribi el Metodo de la clase "Padre"
    }                                             // Si existe el Metodo en la clase "Hija", se ejecutara; pero, sino
}                                                 // existe ese Metodo en la clase "Hija", entonces se ejecutara el
                                                  // Metodo de la clase "Padre".