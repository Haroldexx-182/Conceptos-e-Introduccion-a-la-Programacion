package com.example.pasoporvalor05_02_23;

public class PasoPorValor {
    public static void main(String[] args) {
        int param1 = 10; // 4 bytes
        int param2 = 30; // 4 bytes

        var valor = suma(param1, param2);

        System.out.println(valor);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
