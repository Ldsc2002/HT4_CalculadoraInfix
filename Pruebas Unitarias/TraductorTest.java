/**
 * Pruebas unitarias de clase Tradutor
 * @author Diego Cordova
 * @author Luis Santos
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
    
public class TraductorTest {
        
    private static Traductor trad = new Traductor();
    
    @Test
    public void OrdenOperacion_StringNoOperando() {
        Stack<String> stack = new StackVector<String>();
        assertEquals(true, trad.traducir(stack).isEmpty());
    }
}
    