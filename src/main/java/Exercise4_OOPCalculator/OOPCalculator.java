package Exercise4_OOPCalculator;

import java.util.Scanner;

/**
 * Реализовать калькулятор в стиле ООП
 *
 * @author German Bulavkin
 */

public class OOPCalculator {

    private final Calculator calculator;
    private final Printer printer;

    private String op;

    public String getOp() {
        return op;
    }

    public Double getFirstArg() {
        return firstArg;
    }

    public Double getSecondArg() {
        return secondArg;
    }

    private Double firstArg;
    private Double secondArg;

    public void setOp(String op) {
        this.op = op;
    }

    public void setFirstArg(Double firstArg) {
        this.firstArg = firstArg;
    }

    public void setSecondArg(Double secondArg) {
        this.secondArg = secondArg;
    }

    public OOPCalculator(String op, double firstArg, double secondArg) {
        this.calculator = new Calculator();
        this.printer = new Printer();

        this.op = op;
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public void setNew(String op, double firstArg, double secondArg) {
        this.op = op;
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }


    public Double perform() {
        final String addOp = "+";
        final String subtractOp = "-";
        final String multiplyOp = "*";
        final String divisionOp = "/";

        switch (op) {
            case addOp:
                return calculator.add(firstArg, secondArg);
            case multiplyOp:
                return calculator.multiply(firstArg, secondArg);
            case subtractOp:
                return calculator.subtract(firstArg, secondArg);
            case divisionOp:
                return calculator.divide(firstArg, secondArg);
            default:
                System.out.println("An unsupported operation was provided. " + "Please input one of the supported operations (see above).");
                return Double.NaN;
        }
    }

    public void print(){
        double result = this.perform();
        printer.printValue(firstArg, secondArg, op, result);
    }


    public static void main(String[] args) {
        OOPCalculator oopCalculator = new OOPCalculator("*", 2, 5);
        oopCalculator.print();

        oopCalculator.setNew("/", 19, 3);
        oopCalculator.print();

        oopCalculator.setNew("+", 12, 14);
        oopCalculator.print();

        oopCalculator.setFirstArg(-100.0);
        oopCalculator.setSecondArg(23.0);
        oopCalculator.setOp("-");
        System.out.printf("%.3f %s %.3f = %.3f", oopCalculator.getFirstArg(), oopCalculator.getOp(),
                oopCalculator.getSecondArg(), oopCalculator.perform());
    }
}
