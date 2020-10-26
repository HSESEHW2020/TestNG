package root.sqrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvSqrtTest {

    @Test
    void testNaN(){
        AdvSqrt advSqrt=new AdvSqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.NaN),Double.NaN);
    }

    @Test
    void testInfinite() {
        AdvSqrt advSqrt = new AdvSqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY);
    }

    @Test
    void testMaxValue(){
        AdvSqrt advSqrt = new AdvSqrt();
        Sqrt sqrt=new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.MAX_VALUE),sqrt.sqrt(Double.MAX_VALUE));
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
    void testNegativeZero() {

    }
}
