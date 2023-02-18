package com.example.poo_laherencia_1_3;

// La Herencia + Abstraccion

public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("RNNNNNN");
        System.out.println(coche.getSonido());

        Moto moto = new Moto();
        moto.setSonido("Puffffffff");
        System.out.println(moto.getSonido());
    }
}

abstract class Vehiculo {                             // Clase "Padre" (las clases "Abstractas" no se pueden instanciar)
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {                               // El "Constructor"
        System.out.println("Estoy en el Constructor de Vehiculo");
    }

    abstract public void setSonido(String sonido);            // "Setter" (Una funcion "Abstracta" no tiene Body)
    abstract public String getSonido();                       // "Getter" (Una funcion "Abstracta" no tiene Body)
}

class Coche extends Vehiculo {                                // Clase "Hija1" (Deriva de Vehiculo)
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return "Soy un supersonido: " + this.sonido;
    }
}

class Moto extends Vehiculo {                        // Clase "Hija2" (Tambien deriva de Vehiculo)
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return "Soy un sonidillo de moto " + this.sonido;
    }
}