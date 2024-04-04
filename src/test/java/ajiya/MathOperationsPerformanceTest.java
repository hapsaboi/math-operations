package ajiya;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MathOperationsPerformanceTest {

    private static final int MAX_EXECUTION_TIME_MS = 100; // Maximum allowed execution time in milliseconds

    @Test(timeout = MAX_EXECUTION_TIME_MS)
    public void testAddPerformance() {
        performMethodPerformanceTest("add");
    }

    @Test(timeout = MAX_EXECUTION_TIME_MS)
    public void testSubtractPerformance() {
        performMethodPerformanceTest("subtract");
    }

    @Test(timeout = MAX_EXECUTION_TIME_MS)
    public void testMultiplyPerformance() {
        performMethodPerformanceTest("multiply");
    }

    @Test(timeout = MAX_EXECUTION_TIME_MS)
    public void testDividePerformance() {
        performMethodPerformanceTest("divide");
    }

    @Test(timeout = MAX_EXECUTION_TIME_MS)
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
        assertTrue(methodName + " method execution time exceeded " + MAX_EXECUTION_TIME_MS + " milliseconds", executionTime <= MAX_EXECUTION_TIME_MS);
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

