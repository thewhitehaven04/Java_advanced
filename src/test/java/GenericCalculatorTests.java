import Exercise4_OOPCalculator.OOPCalculator;
import org.junit.Assert;
import org.junit.Test;

public class GenericCalculatorTests {

    private final OOPCalculator oopCalculator = new OOPCalculator();

    @Test
    public void testInvalidOp(){
        double res = oopCalculator.perform(3, 2, "///");
        Assert.assertEquals(Double.NaN, res, 0.001);
    }

    @Test
    public void testResultIsNaNWhenEitherOperandIsNaN(){
        double res = oopCalculator.perform(Double.NaN, -2, "+");
        Assert.assertEquals(Double.NaN, res, 0.001);
    }
}
