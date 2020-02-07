package com.oscarmorton.ejer01;

import java.util.Scanner;


public class Ejer01 {
    public static Scanner lector;
    public Ejer01(){
        int[] numerosIntroducidos = pedirNumero();
        // Imprimo el array
        for(int i = 0; i < numerosIntroducidos.length; i++){
            //No imprime los numeros 0 del array
            if(numerosIntroducidos[i] > 0) {
                System.out.println(numerosIntroducidos[i]);
            }
        }

    }
    public int[] pedirNumero(){
        lector = new Scanner(System.in);
        int nNumeros = 0;
        int arrayLength = 10;
        int[] numerosIntroducidos = new int[arrayLength];



        int numero = 0;
        do {
            System.out.println("Introduce un numero");
            try {
                numero = Integer.parseInt(lector.nextLine());
                if(numero >= 0) {
                    numerosIntroducidos[nNumeros] = numero;
                    nNumeros++;
                }
                if(numerosIntroducidos.length == nNumeros){
                    numerosIntroducidos = duplicarArray(numerosIntroducidos);


                }

            }catch (NumberFormatException nfe){ //Si introduce algo que no es una letra, lo capturo y aviso al usuario.
                System.out.println("Solo se puede introducir numeros");
            }

        }while(numero >= 0);


        return numerosIntroducidos;

    }

    /**
     * Duplica el array introducido
     * @param datos
     * @return
     */
    public int[] duplicarArray(int[] datos){
        int segundoArray[] = new int[datos.length*2];
        for(int i = 0; i < datos.length; i++){
            segundoArray[i] = datos[i];
        }
        return segundoArray;

    }


}


