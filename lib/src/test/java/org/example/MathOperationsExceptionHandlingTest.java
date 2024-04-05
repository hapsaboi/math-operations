package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

@Tags({@Tag("exception")})
public class MathOperationsExceptionHandlingTest {

    public class MathOperationsUnitTest {

        @Test
        public void testDivideByZeroShouldThrowArithmeticException() {
            // Create an instance of MathOperations
            MathOperations math = new MathOperations();

            // Attempt to divide by zero and expect an ArithmeticException
            assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
        }
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
