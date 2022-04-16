import Exercise4_OOPCalculator.OOPCalculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorAdditionTests {

    private final OOPCalculator oopCalculator = new OOPCalculator();
    private final static double DOUBLE_DELTA = 0.0001;

    @Test
    public void testAdditionEqualsToZero(){
        double res = oopCalculator.perform(-10, 10, "+");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }

    @Test

    public void testPositivesAddition(){
        double res = oopCalculator.perform(5, 3, "+");
        Assert.assertEquals(8, res, DOUBLE_DELTA);
    }

    @Test
    public void testNegativesAddition(){
        double res = oopCalculator.perform(-5, -2, "+");
        Assert.assertEquals(-7, res, DOUBLE_DELTA);
    }

    @Test
    public void testInfinityAddition(){
        double res = oopCalculator.perform(Double.POSITIVE_INFINITY,-1, "+");
        Assert.assertEquals(Double.POSITIVE_INFINITY, res, DOUBLE_DELTA);
    }

    @Test
    public void testZeroesAddition(){
        double res = oopCalculator.perform(0,0, "+");
        Assert.assertEquals(0, res, DOUBLE_DELTA);
    }

}
