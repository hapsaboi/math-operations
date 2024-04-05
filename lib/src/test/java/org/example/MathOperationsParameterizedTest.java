package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;

import java.util.Arrays;
import java.util.Collection;

@Tags({@Tag("parameterized")})
public class MathOperationsParameterizedTest {

    @ParameterizedTest
    @MethodSource("data")
    public void testAdd(int a, int b, int expectedResult) {
        MathOperations math = new MathOperations();
        assertEquals(expectedResult, math.add(a, b));
    }

    static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 3, 5},
                {0, 0, 0},
                {-2, -3, -5},
                {10, 20, 30},
                {100, -50, 50}
        });
    }
}
