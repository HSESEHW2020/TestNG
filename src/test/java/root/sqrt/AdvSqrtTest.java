package root.sqrt;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvSqrtTest {

    @Test
    void testNonZeroNegative() {
        AdvSqrt impl = new AdvSqrt();

        double negInfRes = impl.sqrt(Double.NEGATIVE_INFINITY);
        assertTrue(Double.isNaN(negInfRes));

        double regularNegativeRes = impl.sqrt(-6.67);
        assertTrue(Double.isNaN(regularNegativeRes));
    }

    @Test
    void testNegativeZero() {

    }
}