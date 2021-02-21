/**
 * Pruebas unitarias de clase Calculadora
 * @author Diego Cordova
 * @author Luis Santos
 * @version 1.0
*/

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import java.util.Random;
    
public class CalculadoraTest {
        
    private static Calculadora calc = Calculadora.getCalculadora(); 
    
    @Test
    public void SetImplementationWithOffNumber() {
        assertEquals(false, calc.setImplementacion(4));
    }

    @Test
    public void getCalculadoraSingleTone() {
        assertEquals(calc, calc.getCalculadora());
    }

    @Test
    public void RestaWithNegativeResult() {
        assertEquals(4, calc.resta(1, -3));
    }

    @Test
    public void SumaConCeros() {
        assertEquals(0, calc.suma(0, 0));
    }

    @Test
    public void MulctiplicacionPorCero() {
        assertEquals(0, calc.multiplicacion(5340, 0));
    }

    @Test
    public void DivisionDentroDeUno() {
        Random rand = new Random();
        int temp = rand.nextInt(1000);
        assertEquals(temp, calc.division(temp, 1));
    }

    @Test
    public void decode_withNoFile() {
        String a = "archivo";
        assertEquals("Archivo no encontrado", calc.decode(a));
    }

    @Test
    public void operar_withEmptyStack() {
        Stack<String> stack = new StackVector<String>();
        assertEquals(calc.operar(stack), 0);
    }
}
    