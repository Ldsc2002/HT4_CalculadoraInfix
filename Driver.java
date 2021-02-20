/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Driver.java
* @author Diego Cordova
* Ultima modificacion: 2021-02-5
*
* Clase Driver
* Driver Program
********************************************************/

import java.util.Scanner;

public class Driver {

    /**
     * implementation of singletone design pattern, it can be only one instance of Calculadora while the program is running
     **/
    private static iCalculadora calc = Calculadora.getCalculadora(); 
    private static Scanner scan = new Scanner(System.in);
    
    /** 
     * simplification of System.out.println
     * @param o
     */
    private static void print(Object o){
        System.out.println(o);
    }

    /** 
     * Shows a message and ask for an input
     * input 
     * @return String
     */
    private static String input(){
        print("\nIngrese el nombre del archivo a leer sin postfijo de tipo \".txt\"\n");
        return scan.next();
    }
    
    /** 
     * It prints a mesage, ask for an input and aplies defenssive programming
     * @param size size of menu
     * @return boolean
     */
    private static boolean input(int size){

        print("\nEscoja una opcion:\n1. Leer otro archivo\n2. Salir\n");
        while (true) { //Se repite hasta que se logre el return

            try { 
              int opcion = Integer.parseInt(scan.next());
              if (opcion > 0 && opcion < (size + 1)) {
                if (opcion == 1){
                    return true;

                } else{
                    return false;
                }

              } else {
                throw new NumberFormatException();
              }

            } catch (NumberFormatException e) {
                print("\nERROR: Escoja una opcion valida\n");
            }
        }
    }

    /** 
     * It prints a mesage, ask for an input and aplies defenssive programming
     * @param size size of menu
     * @return boolean
     */
    private static int input(String menu, int size){

        print(menu);
        while (true) { //Se repite hasta que se logre el return

            try { 
              int opcion = Integer.parseInt(scan.next());
              if (opcion > 0 && opcion < (size + 1)) {
                return opcion;

              } else {
                throw new NumberFormatException();
              }

            } catch (NumberFormatException e) {
                print("\nERROR: Escoja una opcion valida\n");
            }
        }
    }
    
    /** 
     * main method
     * @param args
     */
    public static void main (String[] args){

        print("Bienvenido a la caluladora Posfix UVG!!\n\n");
        int opcionStack;
        boolean menu = true;

        while (menu){
            opcionStack = input("Que implementacion de stack quiere utilizar?\n1. Vector\n2. Linked List\n3. Double Linked List\n", 3);
            //TODO utilizar variable opcionstack para factory de stacks
            String file = input();
            print("\nLEYENDO EL ARCHIVO: " + file + "\n");
            print(calc.decode(file));
            menu = input(2);
        }
        
        print("\n\nGracias por utilizar la calculadora posfix UVG\n\n");
    }
}