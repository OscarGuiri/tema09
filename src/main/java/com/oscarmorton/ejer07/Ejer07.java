package com.oscarmorton.ejer07;

public class Ejer07 {
    public Ejer07(){
        String[] prueba = {"Patata", "Espanya",null, "Algo interesante" };
        System.out.println("***Exeption NullPointExeption test with string arrays***");

        mostrarCadenesArray(prueba);


    }

    /**
     * Muestra el primer caracter de cada string del array
     * @param cadena La cadena introducido
     */
    public void mostrarCadenesArray(String[] cadena){
        for(int i = 0; i < cadena.length; i++){
            try {
                System.out.println(cadena[i].charAt(0));
            }catch(NullPointerException npe){
                System.out.println("El string en posicion " + i + " del array está en nulo");
            }
        }


    }
}
