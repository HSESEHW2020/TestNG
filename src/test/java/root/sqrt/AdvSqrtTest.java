package root.sqrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvSqrtTest {

    @Test
    void testBasicCorrectness() {
        AdvSqrt impl = new AdvSqrt();
        Sqrt sampleImpl = new Sqrt();


        double res = impl.sqrt(4);

        assertEquals(res, 2.0);
        assertEquals(res, sampleImpl.sqrt(4));

        double square = 443.78;
        assertEquals(impl.sqrt(square), sampleImpl.sqrt(square));
    }

    @Test
    void testNaN(){
        AdvSqrt advSqrt=new AdvSqrt();
        boolean check=Double.isNaN(advSqrt.sqrt(Double.NaN));
        Assert.assertTrue(check);
    }


    @Test
    void testMaxValue(){
        AdvSqrt advSqrt = new AdvSqrt();
        Sqrt sqrt=new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.MAX_VALUE),sqrt.sqrt(Double.MAX_VALUE));
    }

    @Test
    void testMinValue(){
        AdvSqrt advSqrt = new AdvSqrt();
        Sqrt sqrt=new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.MIN_VALUE),sqrt.sqrt(Double.MIN_VALUE));
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
    void testPlusInfinity()
    {
        AdvSqrt test = new AdvSqrt();
        double result = test.sqrt(Double.POSITIVE_INFINITY);
        assertEquals(result, Double.POSITIVE_INFINITY);
    }
}
