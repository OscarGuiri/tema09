package com.oscarmorton.ejer03;

import java.util.Scanner;

public class Ejer03 {
    public static Scanner lector;
    public Ejer03(){
        System.out.println("*** PEDIR NUMEROS HASTA QUE EL USUARIO INTRODUCE UNA LETRA Y VISUALIZA EL NUMERO MAS ALTO***");
        boolean lleno = false;

        int numeroMasGrande = 0;
        int[] numerosIntroducidos = pedirNumeros();
        for(int i = 0; i < numerosIntroducidos.length; i++){
            //No imprime los numeros -1 del array
            if(numerosIntroducidos[i] > 0) {
                if(numerosIntroducidos[i] > numeroMasGrande){
                    numeroMasGrande = numerosIntroducidos[i];
                    lleno = true;
                }
            }
        }
        //Compruebo si el array está lleno, sino, lo digo al usuario
        if(lleno) {
            System.out.println("El numero mas grande introducido es: " + numeroMasGrande);
        }else{
            System.out.println("No se a introducido numeros");
        }



    }
    public int[] pedirNumeros(){
        lector = new Scanner(System.in);
        int nNumeros = 0;
        int arrayLength = 10;
        int[] numerosIntroducidos = new int[arrayLength];
        boolean salir = false;

        //Primero ago que todos los numeros del array sean -1.
        for(int i= 0; i < numerosIntroducidos.length; i++){

            numerosIntroducidos[i] = -1;
        }

        int numero = 0;
        do {
            System.out.println("Introduce un numero");
            try {
                numero = Integer.parseInt(lector.nextLine());
                if(numero >= 0) {
                    numerosIntroducidos[nNumeros] = numero;
                    nNumeros++;
                }
                // Si el numero de numeros introducido son igual que la longitud, duplico el array.
                if(numerosIntroducidos.length == nNumeros){
                    numerosIntroducidos = duplicarArray(numerosIntroducidos);


                }

            }catch (NumberFormatException nfe){ //Si introduce algo que no es una letra, lo capturo y aviso al usuario.
                System.out.println("Has introducido una letra");
                salir = true;
            }

        }while(numero >= 0 && !salir);


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
