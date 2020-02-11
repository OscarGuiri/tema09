package com.oscarmorton.ejer06;

public class Ejer06 {
    public Ejer06(){

        int[] arrayEnteros = {-2,-1,0,1,2};
        dividirEntreArray(2,arrayEnteros);


    }

    /**
     * Divide el numero introducido con los numeros del array introducido
     * @param numeroEnteron
     * @param arrayEnteros
     */
    public void dividirEntreArray(int numeroEnteron, int[] arrayEnteros){
        System.out.println("Resultados: ");
        int resultado = 0;


            for (int i = 0; i < arrayEnteros.length; i++) {
                try {
                    //if(arrayEnteros[i] != 0) {
                        resultado = numeroEnteron / arrayEnteros[i];
                        System.out.println(resultado);
                    //}
                } catch (ArithmeticException ae) {
                    System.out.println("Error aritmetico");
                }
            }


    }

}
