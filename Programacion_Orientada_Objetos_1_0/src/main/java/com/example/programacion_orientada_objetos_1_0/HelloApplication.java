package com.example.programacion_orientada_objetos_1_0;

// Programacion Orientada a Objetos
public class HelloApplication {

    // "Crear Objeto de la Clase Coche": Hay que "Instanciarlo", que significa, que se va a crear una zona en la memoria
    // a traves de una "Variable", y que esa zona en la memoria a traves de una variable, va a tener lo que tenga la
    // "Clase Coche", es decir, se "Crea un Objeto de la Clase Coche", que se va a utilizar posteriormente.
    // Crear una Instancia de una "Clase" es crear un "Objeto".
    // La "Convencion" establece que para crear una instancia de una "Clase" y por lo tanto crear un objeto,
    // debe crearse asi:
    public static void main(String[] args) {
        Coche coche1 = new Coche();  // OBJETO: [Name Clase + Name Variable + Instanciarlo {"=" + New + Nombre Class();}]
        System.out.println(coche1.velocidadActual);       // Viene de imprimir la "Propiedad" = "float velocidadActual;"
        coche1.acelerar();                                // Invocacion de "Funcion"
        System.out.println(coche1.velocidadActual);       // Viene de imprimir la "Propiedad" = "velocidadActual += 15;"
        coche1.desacelerar();                             // Invocacion de "Funcion"

        Coche coche2 = new Coche(); // Podemos crear multiples coches y cada uno de estos coches tiene sus variables (
        Coche coche3 = new Coche(); // numeroDePuertas|velocidadMaxima|velocidadActual) independientes del resto de
        Coche coche4 = new Coche(); // coches, porque "new Coche()" asigna memoria en una zona independiente a donde
        Coche coche5 = new Coche(); // estuvieran las otras variables, es decir, comparten "Propiedades" y los mismos
        Coche coche6 = new Coche(); // "Metodos", pero no son los mismos "Objetos".-
        System.out.println(coche6.velocidadActual); // El coche6 no tiene nada que ver con el coche1, estan en zonas de
                                                    // la memoria totalmente diferentes.-
    }
}
class Coche {                       // Las Clases son variables. Las Variables dentro de una clase son independientes.-
    int numeroDePuertas;            // "Propiedades"
    int velocidadMaxima;            // "Propiedades"
    float velocidadActual;          // "Propiedad"

    // "void" = Cuando no se devuelvan valores
        public void acelerar() {   // Dentro de la clase, existen "Funciones", se denominan "Metodos"
            velocidadActual += 15; // No se esta declarando esta Variable fuera de la clase, xq pertenece a esta clases.-
        }
    public void desacelerar() {}   // "Funciones"
}