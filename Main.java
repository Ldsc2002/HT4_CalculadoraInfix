/**
 * Main
 * @author Luis Santos
 * @version 1.0
*/

public class Main {
    public static void main(String[] args) {
        Calculadora Calc = new Calculadora(); //Crea una instancia de la calculadora

        System.out.println(Calc.decode("datos.txt")); //Corre decode con el archivo 
    }
}
