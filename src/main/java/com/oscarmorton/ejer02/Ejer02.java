package com.oscarmorton.ejer02;
import java.util.Scanner;
public class Ejer02 {
    public static Scanner lector;
    private int contadorExceptions = 0;
    public Ejer02(){
        int[] numeros = new int[10];
        numeros = pedirNumeros(10);
        for(int i = 0; i < numeros.length; i++){
            //No imprime los numeros 0 del array
            if(numeros[i] >= 0) {
                System.out.println(numeros[i]);
            }
        }



    }

    /**
     * Pide y valida los numeros introducidos
     * @return Un array de numeros
     */

    public int[] pedirNumeros(int cuantosNumeros){
        lector = new Scanner(System.in);
        int numero = 0;
        int[] numeros = new int[cuantosNumeros];

        for(int i = 0; i < numeros.length; i++){
           numeros[i] = -1;
        }

        int nNumeros = 0;

        do {
            System.out.println("Introduce el un numero: ");
            try {
                numero = Integer.parseInt(lector.nextLine());
                if (numero >= 0) {
                    numeros[nNumeros] = numero;
                    nNumeros++;
                }


            } catch (NumberFormatException nfe) { //Si introduce algo que no es una letra, lo capturo y aviso al usuario.
                System.out.println("Solo se puede introducir numeros");
                contadorExceptions++;
            }
        }while(numero >= 0);


        return numeros;
    }
}
