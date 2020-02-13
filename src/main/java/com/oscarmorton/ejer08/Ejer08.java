package com.oscarmorton.ejer08;


public class Ejer08 {
    public Ejer08(){
        System.out.println("Comprueba exceptiones " );

        int[] arrayPruebaInts = {10, 20, 0, 50}; // Creo un array de 4 posiciones con un 0
        String[] arrayPruebaString = new String[3];
        arrayPruebaString[0] = "Bulbasaur";
        //arrayPruebaString[1] = "Charmander";
        arrayPruebaString[2] = "Squirtle";

        System.out.println();
        arithmeticExeptionTest(arrayPruebaInts);
        System.out.println();
        nullPointExeptionTest(arrayPruebaString);
        System.out.println();
        indexOutOfBoundsExceptionTest(arrayPruebaInts);

    }
    public void arithmeticExeptionTest(int[] arrayPruebaInts){
        int elemento;

        for(int i = 0; i < arrayPruebaInts.length; i++){
            try {
                elemento = 0 / arrayPruebaInts[i];

            }catch (ArithmeticException ae){
                System.out.println("Arithmetic Exeption en la posicion " + arrayPruebaInts[i] + "! No se puede dividir por 0");

            }
        }
    }

    public void nullPointExeptionTest(String[] arrayPruebaString){
        for(int i = 0; i < arrayPruebaString.length; i++){
            try{
                System.out.println(arrayPruebaString[i].toUpperCase());


            }catch(NullPointerException npe){
                System.out.println("NullPointExeption en la posicon " + i );

            }
        }

    }
    public void indexOutOfBoundsExceptionTest(int[] arrayPruebaInts){
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
