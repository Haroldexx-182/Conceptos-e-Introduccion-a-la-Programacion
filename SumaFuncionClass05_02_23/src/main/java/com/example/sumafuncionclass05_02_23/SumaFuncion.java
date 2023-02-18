package com.example.sumafuncionclass05_02_23;

public class SumaFuncion {
        public static void main(String[] args) {
                int resultado;
                resultado = suma(8, 12);
                System.out.println(resultado);
        }
        public static int suma(int a, int b) {
                //ComenT: El retorno debe ser un INT, porque esta declarado
                // en la parte principal del codigo.-
                return a + b;
        }
}