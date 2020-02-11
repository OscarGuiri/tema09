package com.oscarmorton.ejer05;
import java.util.Scanner;
public class Ejer05 {
    private static Scanner lector;
    private Alumno a1;
    private Alumno a2;
    public Ejer05(){
        int opcion = -1;
        System.out.println("***Ejercicio de excepciones con objetos***");
        System.out.println("Datos alumno 1: ");
        a1 = pedirDatosAlumno();
        System.out.println("Datos alumno 2: ");
        a2 = pedirDatosAlumno();

        System.out.println("Datos alumno 1");
        System.out.println("Nombre: " + a1.getNombre());
        System.out.println("Edad: " + a1.getEdad());
        System.out.println("Altura: " + a1.getAltura());
        System.out.println("Datos alumno 2");
        System.out.println("Nombre: " + a2.getNombre());
        System.out.println("Edad: " + a2.getEdad());
        System.out.println("Altura: " + a2.getAltura());

    }

    /**
     * Pide los datos de un alumno y devuelve un objeto alumno.
     * @return El alumno.
     */
    public Alumno pedirDatosAlumno(){
        String nombre = null;
        Alumno a;
        int edad = 0;
        double altura = 0;
        boolean valido = false;
        lector = new Scanner(System.in);


        do{
            System.out.println("Introduce el nombre: ");
            nombre = lector.nextLine();
            if(nombre.isEmpty()){
                System.out.println("El nombre no puede está vacio");
            }else{
                valido = true;
            }
        }while(!valido);
        valido = false;
        do {
            System.out.println("Introduce la edad: ");
            try{
                edad = Integer.parseInt(lector.nextLine());
                valido = true;


            }catch(NumberFormatException nfe){
                System.out.println("Por favor, solo introduce numeros");
            }

        }while(!valido);
        valido = false;
        do {
            System.out.println("Introduce la altura: ");
            try{
                altura = Double.parseDouble(lector.nextLine());
                valido = true;


            }catch(NumberFormatException nfe){
                System.out.println("Por favor, solo introduce numeros");
            }

        }while(!valido);

       return a = new Alumno(nombre,edad,altura);
    }
}
