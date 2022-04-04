package Calculator;

import java.util.Scanner;

/**
 * @author German Bulavkin
 * - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * - Использовать комментарии и JavaDoc при описании метода.
 * - Использовать форматирование при выводе результата в консоль.
 */


public class CalculatorDispatch implements Runnable {

    private final Calculator floatCalculator = new Calculator();

    private final String addOp = "+";
    private final String subtractOp = "-";
    private final String multiplyOp = "*";
    private final String divisionOp = "/";

    /**
     * Dispatches user input to the necessary calculator method.
     *
     * @param op        mathematical operation. The supported operations are: addition ("+"), subtraction ("-"),
     *                  multiplication ("*") and division("/");
     * @param firstArg  first operand;
     * @param secondArg second operand;
     * @return the result.
     */
    private float dispatch(String op, Float firstArg, Float secondArg) {
        switch (op) {
            case addOp:
                return floatCalculator.addFloat(firstArg, secondArg);
            case multiplyOp:
                return floatCalculator.multiplyFloat(firstArg, secondArg);
            case subtractOp:
                return floatCalculator.subtractFloat(firstArg, secondArg);
            case divisionOp:
                return floatCalculator.divideFloats(firstArg, secondArg);
            default:
                System.out.println("An unsupported operation was provided. " + "Please input one of the supported operations (see above).");
                return 0;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input an operation. The supported operations are: addition(+) and subtraction(-), multiplication(*) and division(/)");
            String op = scanner.nextLine();
            if (op.equals("exit")) {
                // closing the Scanner instance
                System.out.println("Shutting down.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Input the first operand");
                Float firstArg = Float.parseFloat(scanner.nextLine());

                System.out.println("Input the second operand");
                Float secondArg = Float.parseFloat(scanner.nextLine());

                float output = dispatch(op, firstArg, secondArg);
                System.out.printf("%.4f %s %.4f = ", firstArg, op, secondArg);
                System.out.printf(CalculatorOutputFormatting.DEFAULT_FLOAT_OUTPUT_FORMAT + "\n", output);
            }
        }
    }
}
