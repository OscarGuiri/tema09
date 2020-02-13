package com.oscarmorton.ejer09;

public class ArithmeticExeptionTest extends Ejer09 {


    public ArithmeticExeptionTest(int[] arrayPruebaInts){
        int elemento;

        for(int i = 0; i < arrayPruebaInts.length; i++){
            try {
                elemento = 0 / arrayPruebaInts[i];

            }catch (ArithmeticException ae){
                System.out.println("Arithmetic Exeption en la posicion " + arrayPruebaInts[i] + "! No se puede dividir por 0");

            }
        }
    }
}
