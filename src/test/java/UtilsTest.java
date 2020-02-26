import hw.Utils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UtilsTest {

    private static Utils utils;

    @BeforeClass
    public static void init() {
        utils = new Utils();
    }

    @Test
    public void testConcatenateWords() {
        assertEquals("Hello World!", utils.concatenateWords("Hello ", "World!"));
    }

    @Test
    public void testComputeFactorial() {
        assertEquals(120, utils.computeFactorial(5));
    }

    @Test()
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testFactorialWithTimeout() {
        assertEquals(3628800, utils.computeFactorial(10));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testExpectedException() {
        utils.computeFactorial(-10);
    }
}
