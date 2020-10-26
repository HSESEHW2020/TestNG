package root.sqrt;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AdvSqrtTest {


//    @Test
//    void roundTest(){
//        AdvSqrt advSqrt=new AdvSqrt();
//        Sqrt sqrt=new Sqrt();
//        Assert.assertEquals(advSqrt.sqrt(33),sqrt.sqrt(33));
//    }
    @Test
    void testNaN(){
        AdvSqrt advSqrt=new AdvSqrt();
        Sqrt sqrt=new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.NaN),Double.NaN);
    }
    @Test
    void testInfinite(){
        AdvSqrt advSqrt=new AdvSqrt();
        Sqrt sqrt=new Sqrt();
        Assert.assertEquals(advSqrt.sqrt(Double.POSITIVE_INFINITY),Double.POSITIVE_INFINITY);
    }
}