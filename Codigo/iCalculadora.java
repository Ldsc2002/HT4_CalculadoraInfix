/**
 * Interfaz iCalculadora
 * Define los métodos de una calculadora
 * @author Luis Santos
 * @version 1.0
*/

public interface iCalculadora {
    public boolean setImplementacion(int x);
    // pre: Requiere el tipo de implementación
    // post: Devuelve true si el valor es válido

    public int suma(int x, int y); 
    // pre: Requiere dos numeros
    // post: Devuelve la suma de dos numeros

    public int resta(int x, int y); 
    // pre: Requiere dos numeros
    // post: Devuelve la resta de dos numeros

    public int multiplicacion(int x, int y); 
    // pre: Requiere dos numeros
    // post: Devuelve la multiplicación de dos numeros

    public int division(int x, int y); 
    // pre: Requiere dos numeros
    // post: Devuelve la división de dos numeros

    public int operar(IStack x); 
    // pre: Requiere un stack con expresiones en formato postfix
    // post: Devuelve el resultado de las operaciones en el stack

    public String decode(String a); 
    // pre: Requiere un string que indica qué archivo va a operar
    // post: Devuelve un string con el resultado de todas las operaciones
}