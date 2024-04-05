package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

@Tags({@Tag("mockito")})
public class MathOperationsMockitoTest {

    @Test
    public void testAddWithMockedAddition() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = Mockito.spy(math);
        
        // Mock the behavior of the add method
        Mockito.doReturn(15).when(spyMath).add(10, 5);
        
        // Perform the test
        assertEquals(15, spyMath.add(10, 5));
        
        // Verify that the add method was called with the correct parameters
        Mockito.verify(spyMath).add(10, 5);
    }

    @Test
    public void testSubtractWithMockedSubtraction() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = Mockito.spy(math);
        
        // Mock the behavior of the subtract method
        Mockito.doReturn(5).when(spyMath).subtract(10, 5);
        
        // Perform the test
        assertEquals(5, spyMath.subtract(10, 5));
        
        // Verify that the subtract method was called with the correct parameters
        Mockito.verify(spyMath).subtract(10, 5);
    }

    @Test
    public void testMultiplyWithMockedMultiplication() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = Mockito.spy(math);
        
        // Mock the behavior of the multiply method
        Mockito.doReturn(50).when(spyMath).multiply(10, 5);
        
        // Perform the test
        assertEquals(50, spyMath.multiply(10, 5));
        
        // Verify that the multiply method was called with the correct parameters
        Mockito.verify(spyMath).multiply(10, 5);
    }

    @Test
    public void testIsPrimeWithMockedIsPrime() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = Mockito.spy(math);
        
        // Mock the behavior of the isPrime method
        Mockito.doReturn(true).when(spyMath).isPrime(7);
        
        // Perform the test
        assertTrue(spyMath.isPrime(7));
        
        // Verify that the isPrime method was called with the correct parameters
        Mockito.verify(spyMath).isPrime(7);
    }
}
