package com.example.ejercicio_poo_propiedadprivada;

public class HelloApplication {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Harold Barrios Coffi");
        persona.setEdad(33);
        persona.setTelefonoMovil(7260808);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefonoMovil());

        //Impresion en una sola linea
        System.out.println(persona.getNombre() + " " + persona.getEdad() + " " + persona.getTelefonoMovil() + " ");
    }
}

class Persona {
        private String nombre;
                private int edad;
                        private int telefonoMovil;

                        public void setTelefonoMovil(int telefonoMovil) {
                            this.telefonoMovil = telefonoMovil;
                        }

                        public int getTelefonoMovil() {
                            return this.telefonoMovil;
                        }

                public void setEdad(int edad) {
                    this.edad = edad;
                }

                public int getEdad() {
                    return this.edad;
                }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
}
