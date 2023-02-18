package com.example.buclefor1;

public class BucleFor1 {

    public static void main(String[] args) {
        int valores[] = {1, 2, 3, 4, 5};

                             // 0 < 5
                             // 1 < 5
                             // 2 < 5
                             // 3 < 5
                             // 4 < 5
                             // 5 < 5 ¡¡ ESTA NO¡
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}