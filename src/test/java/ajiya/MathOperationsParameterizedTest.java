package ajiya;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MathOperationsParameterizedTest {
    private int a;
    private int b;
    private int expectedResult;

    public MathOperationsParameterizedTest(int a, int b, int expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 3, 5},
                {0, 0, 0},
                {-2, -3, -5},
                {10, 20, 30},
                {100, -50, 50}
        });
    }

    @Test
    public void testAdd() {
        MathOperations math = new MathOperations();
        assertEquals(expectedResult, math.add(a, b));
    }

    // Similarly, write tests for other methods
}
