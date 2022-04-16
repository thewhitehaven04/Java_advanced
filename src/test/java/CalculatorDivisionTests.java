import Exercise4_OOPCalculator.OOPCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorDivisionTests {

    private final OOPCalculator oopCalculator = new OOPCalculator();
    private final static double DOUBLE_DELTA = 0.0001;

    @Test
    public void testDivisionByZero(){
        double res = oopCalculator.perform(2,0, "/");
        Assert.assertEquals(0, res, Double.POSITIVE_INFINITY);
    }

    @Test
    public void testDivisionResultIsNaNWhenBothOperandsAreEqualToZero(){
        double res = oopCalculator.perform(0, 0,"/");
        Assert.assertEquals(Double.NaN, res, DOUBLE_DELTA);
    }

    @Test
    public void testDivisionResultIsNegativeWhenEitherOperandIsNegative(){
        double res = oopCalculator.perform(2, -2, "/");
        Assert.assertEquals(-1, res, DOUBLE_DELTA);
    }

    @Test
    public void testDivisionResultIsPositiveWhenBothOperandsAreNegative() {
        double res = oopCalculator.perform(-2, -2, "/");
        Assert.assertEquals(1, res, DOUBLE_DELTA);
    }

    @Test
    public void testDivisionOneIsANeutralElement(){
        double res = oopCalculator.perform(5, 1, "/");
        Assert.assertEquals(5, res, DOUBLE_DELTA);
    }
}
