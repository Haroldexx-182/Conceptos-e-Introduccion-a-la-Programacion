package com.example.ejercicioswitchcase;

public class HelloApplication {

    public static void main(String[] args) {
        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Estas en Default");
                break;
        }
    }
}