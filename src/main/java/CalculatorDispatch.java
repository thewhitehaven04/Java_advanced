import java.util.Scanner;

/**
 * @author German Bulavkin
 * - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * - Использовать комментарии и JavaDoc при описании метода.
 * - Использовать форматирование при выводе результата в консоль.
 */


public class CalculatorDispatch {

    private Calculator floatCalculator = new Calculator();

    private String addOp = "+";
    private String subtractOp = "-";

    /**
     * Dispatches user input to the necessary calculator method.
     *
     * @param op        mathematical operation. The supported operations are: addition ("+"), subtraction ("-").
     * @param firstArg  first operand;
     * @param secondArg second operand;
     * @return the result.
     */
    public float dispatch(String op, Float firstArg, Float secondArg) {
        if (op.equals(addOp)) {
            return floatCalculator.addFloat(firstArg, secondArg);
        } else if (op.equals(subtractOp)) {
            return floatCalculator.subtractFloat(firstArg, secondArg);
        } else {
            System.out.println("An unsupported operation was provided. " + "Please input one of the supported operations (see above).");
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorDispatch calculatorDispatch = new CalculatorDispatch();

        System.out.println("In order to exit, input 'exit' (without quotes).");

        while (true) {
            System.out.println("Input an operation. The supported operations are: addition(+) and subtraction(-)");
            String op = scanner.nextLine();
            if (op.equals("exit")) {
                System.exit(0);
            } else {
                System.out.println("Input the first operand");
                Float firstArg = Float.parseFloat(scanner.nextLine());

                System.out.println("Input the second operand");
                Float secondArg = Float.parseFloat(scanner.nextLine());

                float output = calculatorDispatch.dispatch(op, firstArg, secondArg);
                System.out.printf(CalculatorOutputFormatting.DEFAULT_FLOAT_OUTPUT_FORMAT + "\n", output);
            }
        }

    }
}
