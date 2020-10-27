package root.sqrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvSqrtTest {

    static void assertDoubleEquals(double actual, double expected) {
        long fd = Double.doubleToLongBits(actual);
        long sd = Double.doubleToLongBits(expected);

        System.out.println(fd);

        if (!(((fd <= 0 && sd <= 0) || (fd > 0 && sd > 0)) && Math.abs(fd - sd) <= 1)) {
            fail("expected [" + expected + "] but found [" + actual + "]");
        }
    }

    @Test
    void testBasicCorrectness() {
        AdvSqrt impl = new AdvSqrt();
        Sqrt sampleImpl = new Sqrt();

        double res = impl.sqrt(4);

        assertEquals(res, 2.0);
        assertEquals(res, sampleImpl.sqrt(4));

        double square = 443.78;
        assertDoubleEquals(impl.sqrt(square), sampleImpl.sqrt(square));
    }

    @Test
    void testNaN() {
        AdvSqrt advSqrt = new AdvSqrt();
        boolean check = Double.isNaN(advSqrt.sqrt(Double.NaN));
        Assert.assertTrue(check);
    }


    @Test
    void testMaxValue() {
        AdvSqrt advSqrt = new AdvSqrt();
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.MAX_VALUE), sqrt.sqrt(Double.MAX_VALUE));
    }

    @Test
    void testMinValue() {
        AdvSqrt advSqrt = new AdvSqrt();
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.MIN_VALUE), sqrt.sqrt(Double.MIN_VALUE));
    }

    @Test
    void testNonZeroNegative() {
        AdvSqrt impl = new AdvSqrt();

        double negInfRes = impl.sqrt(Double.NEGATIVE_INFINITY);
        assertTrue(Double.isNaN(negInfRes));

        double regularNegativeRes = impl.sqrt(-6.67);
        assertTrue(Double.isNaN(regularNegativeRes));
    }

    @Test
    void testPlusInfinity() {
        AdvSqrt test = new AdvSqrt();
        double result = test.sqrt(Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY);
    }

    @Test
    void testNegativeZero() {
        AdvSqrt test = new AdvSqrt();
        double result = test.sqrt(-0.0);
        assertEquals(Double.doubleToLongBits(-0.0), Double.doubleToLongBits(result));
    }

    @Test
    void testPositiveZero() {
        AdvSqrt test = new AdvSqrt();
        double result = test.sqrt(0.0);
        assertEquals(Double.doubleToLongBits(0.0), Double.doubleToLongBits(result));
    }

    @Test
    void testOne() {
        AdvSqrt test = new AdvSqrt();
        double result = test.sqrt(1);
        assertEquals(result, 1);
    }
}
