package Exercise4_OOPCalculator;

/**
 * Описание задания
 * Добавить обработку исключений в задание с ООП калькулятора (например, исключение может возникнуть при делении на ноль)
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

        try {
            calculator.setOp(op);
            this.lastResult = calculator.perform();
        }
        catch (IllegalArgumentException e){
            System.out.println("Please, pass a valid operation to the method");
            System.out.println("The valid operations are: /, *, +, -");
            this.lastResult = Double.NaN;
        }
        return this.lastResult;
    }

    public void print() {
        printer.printValue(this.calculator.getFirstArg(),
                this.calculator.getSecondArg(),
                this.calculator.getOp(),
                this.lastResult);
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

        // trigger an exception
        oopCalculator.perform(3.7, Math.E, "what is this op");
        oopCalculator.print();
    }
}
