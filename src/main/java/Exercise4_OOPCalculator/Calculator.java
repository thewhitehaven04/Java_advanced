package Exercise4_OOPCalculator;


/**
 * This is the calculator class.
 */
class Calculator {

    /**
     * Returns the sum of two double-precision floating point values.
     *
     * @param x Double class instance;
     * @param y Double class instance;
     * @return the sum of the floats.
     */
    Double add(Double x, Double y) {
        return x + y;
    }

    /**
     * Returns the difference between two double-precision floating point values.
     *
     * @param x Double class instance;
     * @param y Double class instance;
     * @return the difference between the two floats.
     */
    Double subtract(Double x, Double y) {
        return x - y;
    }

    /**
     * Returns the product of the double-precision floating point values
     *
     * @param x Double class instance;
     * @param y Double class instance;
     * @return the product of the floats
     */
    Double multiply(Double x, Double y) {
        return x * y;
    }

    /**
     * Returns the quotient of the floats.
     *
     * @param x Double class instance;
     * @param y Double class instance;
     * @return the quotient of the floats.
     */
    Double divide(Double x, Double y) {
        return x / y;
    }
}


