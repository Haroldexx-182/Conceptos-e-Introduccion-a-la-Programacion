package com.example.pasoporreferenciaobjeto;

public class EjercicioRegerenciaMiRubicon {

    public static void main(String[] args) {
        Rubicon miCoche = new Rubicon();       //Referencia "Objeto"
        miCoche.AgregarPuerta();
              System.out.println(miCoche.Puertas);
    }
    public static int suma(int a, int b) {
        return a + b;
    }
}
class Rubicon {
    public int Puertas = 2;

    public void AgregarPuerta() {
        this.Puertas++;
    }
}