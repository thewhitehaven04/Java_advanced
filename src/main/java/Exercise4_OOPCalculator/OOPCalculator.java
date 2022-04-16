package Exercise4_OOPCalculator;

import java.util.Scanner;

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
        } catch (IllegalArgumentException e) {
            System.out.println("Please pass a valid operation to the method");
            System.out.println("The valid operations are: /, *, +, -");
            this.lastResult = Double.NaN;
        } catch (ArithmeticException e) {
            System.out.println("Please pass a non-zero value to the second operand");
            this.lastResult = Double.NaN;
        }
        return this.lastResult;
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
                System.out.println("Shutting down.");
                break;
            } else {
                try {
                    System.out.println("Input the first operand");
                    double firstArg = Double.parseDouble(scanner.nextLine());

                    System.out.println("Input the second operand");
                    double secondArg = Double.parseDouble(scanner.nextLine());

                    double output = perform(firstArg, secondArg, op);
                    printer.printValue(firstArg, secondArg, op, output);
                } catch (NumberFormatException e) {
                    System.out.println("Please pass a valid floating point number.");
                }
            }
        }
        // closing the Scanner instance
        scanner.close();
    }


    public void print() {
        printer.printValue(
                this.calculator.getFirstArg(),
                this.calculator.getSecondArg(),
                this.calculator.getOp(),
                this.lastResult
        );
    }

    public static void main(String[] args) {
        OOPCalculator oopCalculator = new OOPCalculator();
        oopCalculator.perform(5.0, 10.0, "/");
        oopCalculator.print();

        oopCalculator.perform(10.3, 0, "*");
        oopCalculator.print();

        oopCalculator.perform(6.421, 10.0, "+");
        oopCalculator.print();

        oopCalculator.perform(3.0, Math.PI, "-");
        oopCalculator.print();

        // trigger the IllegalArgumentException
        System.out.println("\nIllegal operation handling\n");
        oopCalculator.perform(3.7, Math.E, "what is this op");
        oopCalculator.print();

        // trigger the DivisionByZeroException
        System.out.println("\nDivision by zero handling\n");
        oopCalculator.perform(5, 0.0, "/");
        oopCalculator.print();

        // user input mode
        oopCalculator.run();
    }
}
