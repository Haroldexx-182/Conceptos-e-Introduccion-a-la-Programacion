package com.example.repercusiondeloserrores;

public class HelloApplication {

    // Perdida de Precision: Tengo un valor flotante y lo convierto en un entero.
    // Ejemplo #1
    public void main(String[] args) {
        double temperatura = 15.9;                 // Valor Flotante "15.9"
        int temperaturaInt = (int) temperatura;    // Valor Entero "Int"
        imprimetemperatura(temperaturaInt);
    }

    public static void imprimetemperatura(int valor) {
        System.out.println(valor);
    }
}

    // Ejemplo #2:
    public void main(String[] args) {
        double euros = 15.900;                     // Valor Flotante "15.900"
        int euroInt;                               // Valor Entero "Int"
        euroInt = (int)euros;
        imprimeEuros(eurosInt);
    }

    public static void imprimeEuros(int valor) {
        System.out.println(valor);
    }
}

    // Otro error tipico, denominado "Out of bounds" (off-by-one/Error por 1)
    // Las Pc comienzan a contar desde "0" y no "1" como las personas.-
    // Ejemplo:
    public void main(String[] args){
        int array[]=new int[5];                  // el array es de "5" elementos
        System.out.println(array[5]);            // La 5 posicion no es el numero "5", sino el "4", xq
        }                                        // se debe comenzar a contar desde "0"

    // Otro Error es el "Over Flow"
    // Ejemplo:
    public void main(String[] args){
        byte numero=127;
        System.out.println(numero);

        numero+=5;
        System.out.println(numero);
        }
        // El error "overflow" en programación se produce cuando una operación matemática o una conversión de tipo
        // de datos resulta en un valor que es demasiado grande para ser representado dentro del rango permitido
        // para ese tipo de datos. Esto puede causar un desbordamiento de la memoria y hacer que el programa falle o
        // proporcione resultados incorrectos.
        }