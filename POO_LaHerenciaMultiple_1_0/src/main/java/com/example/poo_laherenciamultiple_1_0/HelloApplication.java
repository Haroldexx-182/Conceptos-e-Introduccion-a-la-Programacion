package com.example.poo_laherenciamultiple_1_0;

// La Herencia "Multiple"

public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();

    }
}

class Vehiculo {
    int velocidadMaxima;

    public Vehiculo() {                               // El "Constructor"
        System.out.println("Estoy en el Constructor de Vehiculo");
    }

class Motor {
        String tipoMotor() {
            System.out.println("Estoy en el constructor de Mortor");
                    }
}

class Coche extends Motor, Vehiculo {                // Herencia "Multiple" cuando una clase "Hija" hereda propiedades
        public Coche() {                             // y metodos de 2 ó mas clases "Padre"
            this.velocidadMaxima;
            this.tipoMotor();
        }
}
}