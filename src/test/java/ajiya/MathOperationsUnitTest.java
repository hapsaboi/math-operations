package ajiya;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathOperationsUnitTest {

    @Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        assertEquals(5, math.add(2, 3));
        assertEquals(-1, math.add(2, -3));
        assertEquals(0, math.add(0, 0));
        assertEquals(1000, math.add(500, 500));
    }

    @Test
    public void testSubtract() {
        MathOperations math = new MathOperations();
        assertEquals(1, math.subtract(3, 2));
        assertEquals(5, math.subtract(2, -3));
        assertEquals(0, math.subtract(0, 0));
        assertEquals(0, math.subtract(500, 500));
    }

    @Test
    public void testMultiply() {
        MathOperations math = new MathOperations();
        assertEquals(6, math.multiply(2, 3));
        assertEquals(-6, math.multiply(2, -3));
        assertEquals(0, math.multiply(0, 0));
        assertEquals(250000, math.multiply(500, 500));
    }

    @Test
    public void testDivide() {
        MathOperations math = new MathOperations();
        assertEquals(2, math.divide(6, 3));
        assertEquals(-2, math.divide(6, -3));
        assertEquals(0, math.divide(0, 5));
        assertEquals(500, math.divide(5000, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        MathOperations math = new MathOperations();
        math.divide(10, 0);
    }

    @Test
    public void testIsPrime() {
        MathOperations math = new MathOperations();
        assertTrue(math.isPrime(2));
        assertTrue(math.isPrime(3));
        assertTrue(math.isPrime(5));
        assertFalse(math.isPrime(4));
        assertFalse(math.isPrime(6));
        assertFalse(math.isPrime(100));
    }
}
