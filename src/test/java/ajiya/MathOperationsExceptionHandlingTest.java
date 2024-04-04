package ajiya;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathOperationsExceptionHandlingTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroShouldThrowArithmeticException() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Attempt to divide by zero
        math.divide(10, 0);
        
        // If the test reaches this point without throwing an exception,
        // the test will fail automatically
    }

    @Test
    public void testDivideByNonZeroShouldNotThrowException() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Attempt to divide by a non-zero number
        try {
            math.divide(10, 2);
        } catch (ArithmeticException e) {
            // If an exception is thrown, fail the test
            fail("Unexpected exception: " + e.getMessage());
        }
    }


    @Test
    public void testDivideByPositiveShouldNotThrowException() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Attempt to divide by a positive number
        try {
            math.divide(10, 2);
        } catch (ArithmeticException e) {
            // If an exception is thrown, fail the test
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}
