/**
 * Pruebas unitarias de clase LinkedList
 * @author Diego Cordova
 * @author Luis Santos
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;   
    
public class ListLinkedListTest {

    private static List<String> list = new ListLinkedList<String>();

    @Test
    public void insertElement(){
        assertEquals(true, list.insert("x"));
    }

    @Test
    public void insertAt_withEmptyList(){
        assertEquals(true, list.insertAt("x", 0));
    }
   
    @Test
    public void insertAtstart_withEmptyList(){
        assertEquals(false, list.insertAtStart("x"));
    }

    @Test
    public void insertAtEnd_withEmptyList(){
        assertEquals(false, list.insertAtEnd("x"));
    }

    @Test
    public void removeAt_valueReturn(){
        String temp = "x";
        list.insert(temp);
        assertEquals(temp, list.removeAt(0));
    }

    @Test
    public void removeAtStart_withEmptyList(){
        
        while (!list.isEmpty()){
            list.removeAtEnd();
        }

        boolean temp = false;

        try {
            list.removeAtStart();
        } catch (Exception e) {
            temp = true;
        }

        assertEquals(true, temp);
    }

    @Test
    public void removeAtEnd_(){
        list.insert("x");
        list.insert("y");
        list.insert("z");
        assertEquals("z", list.removeAtEnd());
    }

    @Test
    public void count_WithEmptyList(){
        while (!list.isEmpty()){
            list.removeAtEnd();
        }
        assertEquals(0, list.count());
    }

    @Test
    public void isEmpty_WithEmptyStack(){

        while (list.count() != 0){
            list.removeAtEnd();
        }
        assertEquals(true, list.isEmpty());
    }

}
    