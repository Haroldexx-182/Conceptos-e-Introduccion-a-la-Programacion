package com.example.ejerciciocondicionalesif;

public class HelloApplication {

    public static void main(String[] args) {
            //(Variable)
       int numero = -50;

        if (numero > 0) {                                       //Condicion
            System.out.println("Numero Positivo");              //Accion a tomar
        } else if (numero < 0) {                                //Condicion
            System.out.println("Numero Negativo");              //Accion a tomar
        } else {                                                //Condicion
            System.out.println("El Numero es Cero");            //Accion a tomar
      }
    }
}