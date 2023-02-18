package com.example.switchcase;

public class SwitchCase {

    public static void main(String[] args) {
      var estacion = "VERANO";

      switch(estacion) {
          case "VERANO":                             //Caso #1
              System.out.println("es verano");
              break;                                 //Palabra Reservada
          case "INVIERNO":                           //Caso #2
              System.out.println("es invierno");
              break;                                  //Palabra Reservada
          default:
              System.out.println("estoy en default");
      }
    }
}
