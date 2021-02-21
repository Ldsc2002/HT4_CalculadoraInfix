/**
 * Pruebas unitarias de clase StackVector
 * @author Diego Cordova
 * @author Luis Santos
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;   
    
public class StackVectorTest {

    Stack<String> stack = new StackVector<String>();

    /**
     * push an empty String to the stack
     * @result the stak should recive it and place it on last place in stack
     */
    @Test
    public void pushEmptyString() {
        String temp = "";
        stack.push(temp);
        assertEquals(temp, stack.pop());
    }

    /**
     * use peek on size one stack
     * @result the peek of a size one stack should return the elemt in stack
     */
    @Test
    public void peek_SizeOneStack() {
        String temp = "X";
        stack.push(temp);
        assertEquals(temp, stack.peek());
    }

    /**
     * do pop on empty stack 
     * @result the pop should return a null
     */
    @Test
    public void popEmptyStack(){
        String temp = "x";
        stack.push(temp);
        assertEquals(temp,  stack.pop());
    }

    /**
     * use empty method on an empty stack
     * @result it should return true
     */
    @Test
    public void EmptyOnEmptyStack(){
        boolean empty = stack.isEmpty();
        assertEquals(true, empty);
    }

    /**
     * use size method on empty stack
     * @result it should return 0
     */
    @Test
    public void sizeOnEmptyStack(){
        int size = stack.count();
        assertEquals(0, size);
    }
}
    