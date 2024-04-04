package ajiya;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    MathOperationsUnitTestSuite.class,
    MathOperationsIntegrationTestSuite.class,
    MathOperationsParameterizedTestSuite.class,
    MathOperationsExceptionHandlingTestSuite.class
})
public class MathOperationsMasterTestSuite {
    // This class remains empty.
    // It is only used as a holder for the above annotations.
}
