package com.example.bucledowhile;

public class BucleDoWhile {

    public static void main(String[] args) {
        int contador = 2;

        do {
            System.out.println(contador);
            contador = contador -1;        //Primero se Ejecuta las Acciones (lo contrario al BUCLE WHILE);
        } while(contador > 2);             //Despues se evalua la Condicion (lo contrario al BUCLE WHILE).-
    }
}