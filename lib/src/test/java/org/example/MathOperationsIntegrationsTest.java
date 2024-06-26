package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

@Tags({@Tag("integration")})
public class MathOperationsIntegrationsTest {

    @Test
    public void testAddAndMultiplyIntegration() {
        MathOperations math = new MathOperations();
        assertEquals(20, math.multiply(math.add(2, 3), 4));
        assertEquals(15, math.multiply(math.add(0, 3), 5));
        assertEquals(0, math.multiply(math.add(0, 0), 10));
    }

    @Test
    public void testSubtractAndDivideIntegration() {
        MathOperations math = new MathOperations();
        assertEquals(2, math.divide(math.subtract(6, 2), 2));
        assertEquals(1, math.divide(math.subtract(5, 2), 3));
        assertEquals(0, math.divide(math.subtract(0, 0), 10));
    }
}
