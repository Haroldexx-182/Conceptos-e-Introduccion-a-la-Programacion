package com.example.gestiondeerrores;

public class HelloApplication {

    public static void main(String[] args) {

        // No pueden abreviarse los "Nombres" de las "Variables", a menos que sea una abreviacion
        // reconocida por la industria, para que otra (s) persona (s) sepan para que vale esa "Variable".-
        int numeros[][] = {
                {10, 20, 30, 40, 50},
                {10, 20, 30, 40, 50}
        };

        // Utilizando "Bucles For", esta permitido usar "Variables" con nombre abreviado "i", "j" ó "k",
        // en estos casos tan especiales, porque es una practica de la industria, un standar, muy comun.-

            // EJEMPO: Variable abreviada "i" = index | Indice
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

    // Tambien esta permitida la abrebiatura del nombre de la Variable "tmp" para variables temporales
    public static void main(String[] args) {
        suma(1, 2);
    }
    // EJEMPO: Variable abreviada "tmb" = Temp | Tempotales
    public static int suma(int a, int b) {
        tmp = a + b;
        return tmp;
    }
}
    // Una buena practica, es explicar con "Comentarios" lo que hacen los codigos, de forma explicita, por ejemplo:
    public static void main(String[] args) {
        int numeros[][] = {
        {10, 20, 30, 40, 50},
        {10, 20, 30, 40, 50}
    };

        // Recorremos el array bidimensional numeros, y por cada
        // subarray del mismo, mostraremos el valor que tiene en
        // momento.
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);


        // Es igual de "Malo", no colocar "Comentarios" explicando lo que hace el codigo,
        // como "Colocar" comentarios para explicar codigos que a simple vista son evidentes
        // su funcion (s), Ejemplo:
        var temperatura = 15;
        // Compruebo que la temperatura sea 15
        if (temperatura ==15) {
        // Ahora imprimo su valor en pantalla
        System.out.println("es 15");
        }
        }
        // "Los Comentarios" son magicos, no por eso se deben hacer una chorrera de comentarios.
        // Los comentarios son para nuestro "Yo" del futuro, nuestro "Yo" del futuro es de aqui
        // a 5 seg. que no te me voy acordar de porque haz hecho una cosa.-
        // Los comentarios "Necesarios" ayudan mucho.-