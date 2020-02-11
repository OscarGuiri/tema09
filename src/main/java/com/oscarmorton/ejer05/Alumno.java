package com.oscarmorton.ejer05;

public class Alumno {
    private String nombre;
    private int edad;
    private double altura;

    /**
     * Contructor por defecto
     */
    public Alumno(){
        this.nombre = "pepe";
        this.edad = 20;
        this.altura = 1.75;
    }



    /**
     * Contructor
     * @param nombre
     * @param edad
     * @param altura
     */
    public Alumno(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }
}
