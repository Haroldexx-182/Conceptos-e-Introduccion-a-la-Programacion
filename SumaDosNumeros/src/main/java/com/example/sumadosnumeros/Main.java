package com.example.sumadosnumeros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1=0, num2=0, resultado=0;

        Scanner objeto=new Scanner(System.in);
            System.out.println("Ingresar el primer numero de la suma");
            num1=objeto.nextInt();

            System.out.println("Ingresar el segundo numero de la suma");
            num2=objeto.nextInt();

            resultado=num1+num2;

            System.out.println("El resultado de la suma es igual a: " + resultado);

    }
}
