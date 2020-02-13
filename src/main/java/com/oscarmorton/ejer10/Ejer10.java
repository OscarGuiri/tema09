package com.oscarmorton.ejer10;

import java.util.Scanner;
public class Ejer10 {
    public Ejer10() throws InterruptedException {
        final int DELAY = 1000;
        int opcion = -1;
        float operando1 = 0;
        float operando2 = 0;
        float resultado;
        int operando1Resto = 0;
        int operando2Resto = 0;
        int resultadoResto = 0;
        boolean valido  =false;
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("**************************");
            System.out.println("*** CALCULADORA BASICA ***");
            System.out.println("**************************");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Resto división");
            System.out.println("------------------");
            System.out.println("0. Salir");
            System.out.println("Elija una opción: ");
            do {
                try {
                    opcion = Integer.parseInt(lector.nextLine());
                    valido = true;
                } catch (NumberFormatException nfe) {
                    System.out.println("Tienes que introducir un numero");

                }
            }while(!valido);
            switch(opcion) {
                //Suma
                case 1:
                    valido = false;
                    System.out.println("\n************ SUMA ************");

                    do {
                        System.out.println("Introduzca el primer operando: ");
                        try {
                            operando1 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;

                        do {
                            System.out.println("Introduzca el segundo operando: ");
                            try {
                                operando2 = Float.parseFloat(lector.nextLine());
                                valido = true;
                            } catch (NumberFormatException nfe) {
                                System.out.println("Tienes que introducir un numero");

                            }
                        }while(!valido);
                        valido = false;
                    resultado = operando1 + operando2;
                    System.out.println("El resultado es...");
                    Thread.sleep(DELAY);
                    System.out.println("\n" + operando1 + " + " + operando2 + " = " + resultado);
                    System.out.println("\nPulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
                //Resta
                case 2:
                    valido = false;
                    System.out.println("\n************ RESTA ************");

                    do {
                        System.out.println("Introduzca el primer operando: ");
                        try {
                            operando1 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;

                    do {
                        System.out.println("Introduzca el segundo operando: ");
                        try {
                            operando2 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;
                    System.out.println("El resultado es...");
                    Thread.sleep(DELAY);
                    resultado = operando1 - operando2;
                    System.out.println("\n" + operando1 + " - " + operando2 + " = " + resultado);
                    System.out.println("\nPulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
                //Multiplicación
                case 3:
                    valido = false;
                    System.out.println("\n******** MULTIPLICACIÓN *********");

                    do {
                        System.out.print("Introduzca el primer operando: ");
                        try {
                            operando1 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;

                    do {
                        System.out.println("Introduzca el segundo operando: ");
                        try {
                            operando2 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;
                    resultado = operando1 * operando2;
                    System.out.println("El resultado es...");
                    Thread.sleep(DELAY);
                    System.out.println("\n" + operando1 + " x " + operando2 + " = " + resultado);
                    System.out.println("\nPulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
                //División
                case 4:
                    valido = false;
                    System.out.println("\n********** DIVISIÓN ***********");

                    do {
                        System.out.println("Introduzca el primer operando: ");
                        try {
                            operando1 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;

                    do {
                        System.out.println("Introduzca el segundo operando: ");
                        try {
                            operando2 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;
                    resultado = operando1 / operando2;
                    System.out.println("El resultado es...");
                    Thread.sleep(DELAY);
                    System.out.println("\n" + operando1 + " / " + operando2 + " = " + resultado);
                    System.out.println("\nPulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
                //Resto división
                case 5:
                    valido = false;
                    System.out.println("\n******** RESTO DIVISIÓN ********");

                    do {
                        System.out.println("Introduzca el primer operando: ");
                        try {
                            operando1 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;

                    do {
                        System.out.println("Introduzca el segundo operando: ");
                        try {
                            operando2 = Float.parseFloat(lector.nextLine());
                            valido = true;
                        } catch (NumberFormatException nfe) {
                            System.out.println("Tienes que introducir un numero");

                        }
                    }while(!valido);
                    valido = false;
                    resultadoResto = operando1Resto % operando2Resto;
                    System.out.println("El resultado es...");
                    Thread.sleep(DELAY);
                    System.out.println("\n" + operando1Resto + " % " + operando2Resto + " = " + resultadoResto);
                    System.out.println("\nPulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
                //Ponemos la opción 0 para que el no se tome como default
                //pero en realidad no hace nada.
                case 0:
                    break;
                default:
                    System.out.println("\nXXXXXXXXXXXXXXXXXX ERROR XXXXXXXXXXXXXXXXXXXXXXXX");
                    System.out.println(opcion + " no es una opción válida del menú");
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
                    System.out.println("Pulse INTRO para continuar ...");
                    lector.nextLine();
                    break;
            }

        } while (opcion != 0);
        System.out.println("Hasta pronto");
    }
}