/**
 * Traduce las expresiones infix a postfix
 * @author Luis Santos
 * @author Diego Cordova
 * @version 1.0
*/

public class Traductor {

    /**
     * Devuelve el orden de operaciones
     * @param c El operador que se va a evaluar
     * @return El orden que deben tener las operaciones para que la calculadora pueda evaluarlas
     */
    private int OrdenOperacion(String c){
        switch (c){
            //Si es una suma o resta
            case "+":
            case "-":
                return 1; //Importancia 1

            case "*": //Si es una multiplicación o división
            case "/":
                return 2; //Importancia 2
        }
        return -1; //Si no es un operador
    }
        
    /**
     * Traduce una expresión de infix a postfix
     * @param data Los datos que se van a traducir a postfix
     * @return El stack de datos en formato postfix
     */
    public StackList<String> traducir(IStack<String> data) {
        StackList<String> res = new StackList<>();
        StackList<String> stack = new StackList<>();
        
        while (!data.isEmpty()) { //Mientras hayan datos
            String x = data.pop(); //Obtiene un valor del stack data
            if(OrdenOperacion(x) > 0) { //Si es un operador
                while(!stack.isEmpty() && OrdenOperacion(stack.peek()) >= OrdenOperacion(x)){ //Si el stack no esta vacio y el operador es de mayor importancia que el almacenado
                    res.push(stack.pop()); //Añade el operador al stack res
                }
                
                stack.push(x); //Añade el operador al stack
            
            } else if(x.equals(")")){ //Si cierra parentesis
                String y = stack.pop(); //Obtiene un valor del stack
                
                while(!y.equals("(")){ //Hasta que se cierre parentesis
                    res.push(y); //Añade el dato a stack res
                    y = stack.pop(); //Obtiene otro dato del stack
                }
                
            } else if(x.equals("(")){ //Si abre parentesis
                stack.push(x); //Lo añade al stack
    
            } else{ //Si es un número
                res.push(x); //Lo añade al stack
            }
        }
    
        //Para añadir las operaciones finales que estan en el stack
        for (int i = 0; i < stack.count() ; i++) { //Por cada dato en el stack
            res.push(stack.pop()); //Lo añade al stack res
        }

        StackList<String> resInverso = new StackList<>(); //Nuevo stack para el return

        while(!res.isEmpty()) { //Crea un stack inverso
            resInverso.push(res.pop());
        }

        return resInverso; //Devuelve los datos
    }    
}
    


