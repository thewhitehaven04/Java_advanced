import Exercise4_OOPCalculator.OOPCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorMultiplicationTests {

    private final OOPCalculator oopCalculator = new OOPCalculator();
    private final static double DOUBLE_DELTA = 0.0001;

    @Test
    public void testMultiplicationFirstOperandIsZeroCausesResultToZero(){
        double res = oopCalculator.perform(0, 2,"*");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }

    @Test
    public void testMultiplicationSecondOperandIsZeroCausesResultToZero(){
        double res = oopCalculator.perform(2, 0,"*");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }

    @Test
    public void testMultiplicationResultIsZeroWhenBothOperandsAreEqualToZero(){
        double res = oopCalculator.perform(0, 0,"*");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }

    @Test
    public void testMultiplicationResultIsNegativeWhenEitherOperandIsNegative(){
        double res = oopCalculator.perform(-2, 2, "*");
        Assert.assertEquals(-4, res, DOUBLE_DELTA);
    }

    @Test
    public void testMultiplicationResultIsPositiveWhenBothOperandsAreNegative(){
        double res = oopCalculator.perform(-2, -2, "*");
        Assert.assertEquals(4, res, DOUBLE_DELTA);
    }

    @Test
    public void testMultiplicationResultIsInfinityWhenEitherOperandIsInfinite(){
        double res = oopCalculator.perform(Double.POSITIVE_INFINITY, -2, "*");
        Assert.assertEquals(Double.NEGATIVE_INFINITY, res, DOUBLE_DELTA);
    }

}
