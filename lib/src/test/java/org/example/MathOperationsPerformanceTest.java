package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

@Tags({@Tag("performance")})
public class MathOperationsPerformanceTest {

    private static final int MAX_EXECUTION_TIME_MS = 500; // Maximum allowed execution time in milliseconds

    @Test
    public void testAddPerformance() {
        performMethodPerformanceTest("add");
    }

    @Test
    public void testSubtractPerformance() {
        performMethodPerformanceTest("subtract");
    }

    @Test
    public void testMultiplyPerformance() {
        performMethodPerformanceTest("multiply");
    }

    @Test
    public void testDividePerformance() {
        performMethodPerformanceTest("divide");
    }

    @Test
    public void testIsPrimePerformance() {
        performMethodPerformanceTest("isPrime");
    }

    private void performMethodPerformanceTest(String methodName) {
        MathOperations math = new MathOperations();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            invokeMethod(math, methodName); // Execute the method repeatedly
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        assertTrue(executionTime <= MAX_EXECUTION_TIME_MS, methodName + " method execution time exceeded " + MAX_EXECUTION_TIME_MS + " milliseconds");
    }

    private void invokeMethod(MathOperations math, String methodName) {
        switch (methodName) {
            case "add":
                math.add(1, 1);
                break;
            case "subtract":
                math.subtract(1, 1);
                break;
            case "multiply":
                math.multiply(1, 1);
                break;
            case "divide":
                math.divide(1, 1);
                break;
            case "isPrime":
                math.isPrime(1);
                break;
            default:
                throw new IllegalArgumentException("Invalid method name: " + methodName);
        }
    }
}
