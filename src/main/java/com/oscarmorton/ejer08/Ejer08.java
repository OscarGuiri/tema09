package com.oscarmorton.ejer08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ejer08 {
    public Ejer08(){
        System.out.println("Comprueba exceptiones " +
                "a) ArithmeticException\n" +
                "b) NullPointerException\n" +
                "c) IndexOutOfBoundsException");

        int[] arrayPruebaInts = {10, 20, 0, 50}; // Creo un array de 4 posiciones con un 0
        String[] arrayPruebaString = {"Hola", null, "Espanya"};

    }
    public void tratamientoArrayInt(int[] arrayPruebaInts){


    }
}
