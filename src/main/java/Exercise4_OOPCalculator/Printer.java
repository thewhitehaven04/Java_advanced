package Exercise4_OOPCalculator;

class Printer {

    // Default format for outputting operations
    static private final String DEFAULT_DOUBLE_OUTPUT_FORMAT = "%.4f %s %.4f = %.4f\n";

    /**
     * Print a calculator operation.
     *
     * @param firstArg  first operand
     * @param secondArg second operand
     * @param op        calculator operation, such as division (/), addition(+), etc.
     * @param res       operation result
     */
    void printValue(double firstArg, double secondArg, String op, double res) {
        System.out.printf(Printer.DEFAULT_DOUBLE_OUTPUT_FORMAT, firstArg, op, secondArg, res);
    }
}
