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

    public OOPCalculator() {
        this.calculator = new Calculator();
        this.printer = new Printer();
    }

    private Double handleInput(String op, Double firstArg, Double secondArg) {
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

    /**
     * Executes calculator operation loop.
     */
    public void run() {
        System.out.println("In order to exit, input 'exit' (without quotes).");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input an operation. The supported operations are: " + "addition(+) and subtraction(-), multiplication(*) and division(/)");
            String op = scanner.nextLine();
            if (op.equals("exit")) {
                // closing the Scanner instance
                System.out.println("Shutting down.");
                break;
            } else {
                System.out.println("Input the first operand");
                double firstArg = Double.parseDouble(scanner.nextLine());

                System.out.println("Input the second operand");
                double secondArg = Double.parseDouble(scanner.nextLine());

                Double output = handleInput(op, firstArg, secondArg);
                printer.printValue(firstArg, secondArg, op, output);
            }
        }
        scanner.close();
    }

    /**
     * Starts the calculator.
     */
    public static void main(String[] args) {
        OOPCalculator oopCalculator = new OOPCalculator();
        oopCalculator.run();
    }
}
