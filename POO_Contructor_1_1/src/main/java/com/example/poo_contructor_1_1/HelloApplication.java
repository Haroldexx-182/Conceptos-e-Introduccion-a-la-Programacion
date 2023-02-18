package com.example.poo_contructor_1_1;

// Un "Constructor" es una forma de inicializar las propiedades de una clase cuando la "Instanciemos", es decir, un
// "Constructor" es lo primero que se ejecuta cuando instancias esa clase.
// El "Constructor" es el mejor sitio que tenemos para inicializar las porpiedades de una clase.
// Las clases se "Construyen", cuando no se cree un "Constructor", Java automaticamente lo crea. Cuando se crea un
// "Constructor", Java ya no va a crear ningun otro "Constructor"
public class HelloApplication {

    public static void main(String[] args) {
        Coche coche = new Coche();  // Se ejecuta cuando se lee la linea "new Coche", e invoca al "Constructor"
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2, 90);  // Con"Parametros" = SobreCarga del "Constructor" ó "Constructor Overloading"
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche {
    int numeroDePuertas;       // "Propiedades" (Tips: "byte|short|int|long" no pueden tener decimales)
    int velocidadMaxima;       // "Propiedades"
    float velocidadActual;     // "Propiedades" (Tips: "float = double" contiene Numeros Enteros + Decimales)

    // El "Constructor":
    // Un "Constructor" en Java debe seguir una serie de reglas, por ejemplo:
    // Un "Constructor" No devuelve ningun tipo de "Dato" (Tips: No hace falta colocar "void" = No devuelve dato)
    public Coche() { // Los "Constructores" son publicos + Name Constructor = Name Clase + opcional parametros "()" + Body "{}"
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor ***SIN NADA***");
    }
    public Coche(int puertas, int velocidad) {   // "Constructor" con PARAMETROS
        numeroDePuertas = puertas;     // "Funcion"
        velocidadMaxima = velocidad;   // "Funcion"
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }

    // Ejemplo de La sobrecarga de "Funcion" en el tipo de dato (no corre la app por este ejemplo #2)
    public Coche(int numeroDePuertas, int velocidadMaxima) {   // "Constructor" con PARAMETROS #2
        this.numeroDePuertas = numeroDePuertas;  // Tips: Cuando quiero los mismos parametros de la clase se coloca "this.xxxx"
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }

}
