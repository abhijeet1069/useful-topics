import calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    static Calculator calculator;
    @BeforeAll
    static void setup(){
        calculator = new Calculator();
    }

    @Test
    void testAddWithBothInt(){
        assertEquals(5.0,calculator.add(2,3));
    }

    @Test
    void testAddWithOneIntOneFloat(){
        assertEquals(5.2,calculator.add(2,3.2));
    }

    @Test
    void testAddWithBothFloats(){
        assertEquals(6.5,calculator.add(2.6,3.9));
    }

    @Test
    void testAddWithNull(){
        assertThrows(IllegalArgumentException.class,()->calculator.add(null,3.9));
    }

    @Test
    void checkIfOverflowErrorThrown(){
        assertThrows(ArithmeticException.class,()->calculator.add(Double.MAX_VALUE,Double.MAX_VALUE));
    }

    @Test
    void checkIfOverflowErrorThrownForSmallValues(){
        assertEquals(Double.MAX_VALUE,calculator.add(Double.MAX_VALUE/2,Double.MAX_VALUE/2));
    }
}
