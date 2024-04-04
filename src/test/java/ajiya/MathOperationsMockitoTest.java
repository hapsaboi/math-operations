package ajiya;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MathOperationsMockitoTest {

    @Test
    public void testAddWithMockedAddition() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = spy(math);
        
        // Mock the behavior of the add method
        doReturn(15).when(spyMath).add(10, 5);
        
        // Perform the test
        assertEquals(15, spyMath.add(10, 5));
        
        // Verify that the add method was called with the correct parameters
        verify(spyMath).add(10, 5);
    }

    @Test
    public void testSubtractWithMockedSubtraction() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = spy(math);
        
        // Mock the behavior of the subtract method
        doReturn(5).when(spyMath).subtract(10, 5);
        
        // Perform the test
        assertEquals(5, spyMath.subtract(10, 5));
        
        // Verify that the subtract method was called with the correct parameters
        verify(spyMath).subtract(10, 5);
    }

    @Test
    public void testMultiplyWithMockedMultiplication() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = spy(math);
        
        // Mock the behavior of the multiply method
        doReturn(50).when(spyMath).multiply(10, 5);
        
        // Perform the test
        assertEquals(50, spyMath.multiply(10, 5));
        
        // Verify that the multiply method was called with the correct parameters
        verify(spyMath).multiply(10, 5);
    }

    @Test
    public void testIsPrimeWithMockedIsPrime() {
        // Create an instance of MathOperations
        MathOperations math = new MathOperations();
        
        // Create a spy on the MathOperations object
        MathOperations spyMath = spy(math);
        
        // Mock the behavior of the isPrime method
        doReturn(true).when(spyMath).isPrime(7);
        
        // Perform the test
        assertTrue(spyMath.isPrime(7));
        
        // Verify that the isPrime method was called with the correct parameters
        verify(spyMath).isPrime(7);
    }
}
