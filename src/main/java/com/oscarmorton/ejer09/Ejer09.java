package com.oscarmorton.ejer09;

public class Ejer09 {


    public Ejer09(){
        System.out.println("Comprueba exceptiones " );

        int[] arrayPruebaInts = {10, 20, 0, 50}; // Creo un array de 4 posiciones con un 0
        String[] arrayPruebaString = new String[3];
        arrayPruebaString[0] = "Bulbasaur";
        //arrayPruebaString[1] = "Charmander";
        arrayPruebaString[2] = "Squirtle";

        //Creo los objectos

        NullPointExeptionTest n = new NullPointExeptionTest(arrayPruebaString);
        IndexOutOfBoundsExceptionTest i = new IndexOutOfBoundsExceptionTest(arrayPruebaInts);


        System.out.println(n);
        System.out.println(i);


    }
}
