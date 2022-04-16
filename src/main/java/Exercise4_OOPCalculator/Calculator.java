package Exercise4_OOPCalculator;

import java.util.Arrays;
import java.util.HashSet;

/**
 * This is the calculator class.
 */
class Calculator {

    private static final HashSet<String> supportedOps = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    private double firstArg;
    private double secondArg;
    private String op;

    public double getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(double firstArg) {
        this.firstArg = firstArg;
    }

    public double getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(double secondArg) {
        this.secondArg = secondArg;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) throws IllegalArgumentException {
        if (supportedOps.contains(op)) {
            this.op = op;
        } else {
            throw new IllegalArgumentException("Unsupported operation supplied");
        }
    }


    public Calculator(double firstArg, double secondArg, String op) throws IllegalArgumentException {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
        setOp(op);
    }

    /**
     * Performs one of the supported operations and returns the result.
     */
    public double perform() {
        double res = Double.NaN;
        switch (this.op) {
            case "+":
                res = firstArg + secondArg;
                break;
            case "-":
                res = firstArg - secondArg;
                break;
            case "*":
                res = firstArg * secondArg;
                break;
            case "/":
                res = firstArg / secondArg;
                break;
        }
        return res;
    }
}


