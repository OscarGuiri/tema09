package com.oscarmorton.ejer04;

import java.util.Scanner;



public class Ejer04 {
    private final int ARRAYLENGTH = 10;
    private static Scanner lector;
    public Ejer04(){
        int[] numerosIntroducidos = pedirNumeros();
        for(int i = 0; i < numerosIntroducidos.length; i++){
            //No imprime los numeros 0 del array
            if(numerosIntroducidos[i] > 0) {
                System.out.println(numerosIntroducidos[i]);
            }
        }


    }
    public int[] pedirNumeros(){
        lector = new Scanner(System.in);
        int nNumeros = 0;
        boolean arrayCreada = true;
        int[] numerosIntroducidos = new int[ARRAYLENGTH];
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
                

            }catch (NumberFormatException nfe){ //Si introduce algo que no es una letra, lo capturo y aviso al usuario.
                System.out.println("Has introducido una letra");
                salir = true;
            }catch(IndexOutOfBoundsException iob){
                System.out.println("El array está lleno");
                salir = true;

            }catch(NullPointerException npe){
                System.out.println("El array no está creada");
                arrayCreada = false;
            }

        }while(numero >= 0 && !salir);


        return numerosIntroducidos;
    }
}
