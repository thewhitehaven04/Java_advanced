package Exercise4_OOPCalculator;

/**
 * Реализовать калькулятор в стиле ООП
 *
 * @author German Bulavkin
 */

public class OOPCalculator {

    private final Printer printer;
    private final Calculator calculator;
    private double lastResult;

    public OOPCalculator() {
        this.calculator = new Calculator(Double.NaN, Double.NaN, "+");
        this.lastResult = Double.NaN;
        this.printer = new Printer();
    }

    public double perform(double firstArg, double secondArg, String op) {
        calculator.setFirstArg(firstArg);
        calculator.setSecondArg(secondArg);
        calculator.setOp(op);
        this.lastResult = calculator.perform();
        return this.lastResult;
    }

    public void print() {
        printer.printValue(this.calculator.getFirstArg(), this.calculator.getSecondArg(),
                this.calculator.getOp(), this.lastResult);
    }

    public static void main(String[] args) {
        OOPCalculator oopCalculator = new OOPCalculator();
        oopCalculator.perform(5, 10, "/");
        oopCalculator.print();

        oopCalculator.perform(10.3, -2, "*");
        oopCalculator.print();

        oopCalculator.perform(6.421, 10, "+");
        oopCalculator.print();

        oopCalculator.perform(3, Math.PI, "-");
        oopCalculator.print();

        // invalid op
        oopCalculator.perform(3, -9, "someop");
        oopCalculator.print();
    }
}
