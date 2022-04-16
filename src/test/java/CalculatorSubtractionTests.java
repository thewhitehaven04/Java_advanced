import Exercise4_OOPCalculator.OOPCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorSubtractionTests {

    private OOPCalculator oopCalculator = new OOPCalculator();
    private static double DOUBLE_DELTA = 0.0001;

    @Test
    public void testSubtractionEqualsToZero(){
        double res = oopCalculator.perform(-10, -10, "-");
        // the following can fail since you're not supposed to compare doubles without delta
        Assert.assertTrue(res == 0);
    }

    @Test
    public void testPositiveSubtraction(){
        double res = oopCalculator.perform(5, 3, "-");
        Assert.assertEquals(2, res, DOUBLE_DELTA);
    }

    @Test
    public void testNegativeSubtraction(){
        double res = oopCalculator.perform(-5, -4, "-");
        Assert.assertEquals(-1, res, DOUBLE_DELTA);
    }

    @Test
    public void testInfinitySubtraction(){
        double res = oopCalculator.perform(Double.POSITIVE_INFINITY,-1, "-");
        Assert.assertEquals(Double.POSITIVE_INFINITY, res, DOUBLE_DELTA);
    }

    @Test
    public void testZeroesSubtraction(){
        double res = oopCalculator.perform(0,0, "-");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }
}
