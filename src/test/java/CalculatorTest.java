import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(6, calculator.add(-4, 10));
        assertEquals(-52, calculator.add(-42, -10));
    }

    @Test
    void testSqrt() {
        assertEquals(12.0, calculator.sqrt(144.0));
        assertEquals(0.0, calculator.sqrt(0.0));
        assertEquals(2.0, calculator.sqrt(4.0));
        assertEquals(1.0, calculator.sqrt(1.0));
        assertTrue(Double.isNaN(calculator.sqrt(-42)));
    }

    @Test
    void testFactorial() {
        assertEquals(3628800, calculator.factorial(10));
        assertEquals(120, calculator.factorial(5));
        assertEquals(24, calculator.factorial(4));
        assertEquals(1, calculator.factorial(1));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testChecknum() {
        boolean anyMatch = IntStream.range(1, 100).anyMatch(i -> calculator.checknum(i));
        assertTrue(anyMatch);
    }
}
