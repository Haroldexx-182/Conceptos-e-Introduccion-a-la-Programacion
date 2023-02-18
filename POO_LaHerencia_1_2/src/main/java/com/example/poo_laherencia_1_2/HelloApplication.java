package com.example.poo_laherencia_1_2;

//La Herencia (Clase "Hija")

public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("RNNNNNN");
        System.out.println(coche.getSonido());

    }
}

class Vehiculo {                             // Clase "Padre"
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {                               // El "Constructor"
        System.out.println("Estoy en el Constructor de Vehiculo");
    }

        public void setSonido(String sonido) {       // "Setter"
        this.sonido = sonido;
    }

    public String getSonido() {                      // "Getter"
        return this.sonido;
    }
}

class Coche extends Vehiculo {                        // Clase "Hija1" (Deriva de Vehiculo)
}