import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSqrt() {
        assertEquals(12, calculator.sqrt(144));
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testChecknum() {
        boolean anyMatch = IntStream.range(1, 100).anyMatch(i -> calculator.checknum(i));
        assertTrue(anyMatch);
    }
}
