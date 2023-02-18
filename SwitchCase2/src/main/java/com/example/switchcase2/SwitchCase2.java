package com.example.switchcase2;

public class SwitchCase2 {

    public static void main(String[] args) {
        var hoy_es = "DOMINGO";

        switch(hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("hoy es laborable");
                break;
            default:
                System.out.println("hoy NO es laborable");
                break;
        }
    }
}
