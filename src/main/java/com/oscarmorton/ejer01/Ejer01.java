package com.oscarmorton.ejer01;
import java.util.Scanner;

public class Ejer01 {
    public static Scanner lector;
    public Ejer01(){
        lector = new Scanner(System.in);

        int numero = 0;
            do {
                System.out.println("Introduce un numero");
                try {
                    numero = Integer.parseInt(lector.nextLine());
                }catch (NumberFormatException nfe){ //Si introduce algo que no es una letra, lo capturo y aviso al usuario.
                    System.out.println("Solo se puede introducir numeros");
                }


            }while(numero >= 0);
            System.out.println("Adios!");
        }


}


