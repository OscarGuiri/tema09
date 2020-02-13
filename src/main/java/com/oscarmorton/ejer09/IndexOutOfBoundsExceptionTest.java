package com.oscarmorton.ejer09;

public class IndexOutOfBoundsExceptionTest extends Ejer09 {
    public  IndexOutOfBoundsExceptionTest(int[] arrayPruebaInts){
        int elemento;
        boolean salir = false;
        int contador = 0;

        do{
            try {
                elemento = arrayPruebaInts[contador];
                System.out.println(elemento);
                contador++;

            }catch ( IndexOutOfBoundsException iobe){
                System.out.println("Index Out Of Bounds Exception! El maximo longitud del array es " + arrayPruebaInts.length);
                salir = true;
            }
        }while(!salir);
    }
}
