package com.oscarmorton.ejer09;

public class NullPointExeptionTest extends Ejer09 {


    public NullPointExeptionTest(String[] arrayPruebaString){
        for(int i = 0; i < arrayPruebaString.length; i++){
            try{
                System.out.println(arrayPruebaString[i].toUpperCase());


            }catch(NullPointerException npe){
                System.out.println("NullPointExeption en la posicon " + i );

            }
        }

    }
}
