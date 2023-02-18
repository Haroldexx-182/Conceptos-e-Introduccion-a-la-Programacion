package com.example.callstack_piladellamadas_1_0;

// Stack Trace/Call Stack | Pila de Llamadas
public class HelloApplication {

    public static void main(String[] args) {
        funcion1();
    }
    public static void funcion1() {
        funcion2();
    }
    public static void funcion2() {
        funcion3();
    }
    public static void funcion3() {
        funcion4();
    }
    public static void funcion4() {
        System.out.println("Vaya viaje nos estamos dando");
        var i = 15;
        System.out.println(15/0);
    }
}
