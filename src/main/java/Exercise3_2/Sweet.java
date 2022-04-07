package Exercise3_2;

/**
 * Models gifts.
 */
public abstract class Sweet {

    private final String name;
    private final double weightKgs;
    private final double priceRub;

    public Sweet(String name, double weightKgs, double priceRub) {
        this.name = name;
        this.weightKgs = weightKgs;
        this.priceRub = priceRub;
    }

    /**
     * Prints gift details.
     */
    public abstract void printSweetInfo();

    /**
     * Get sweets weight in kilos.
     *
     * @return weightKgs weight in kilos
     */
    public double getWeightKgs() {
        return weightKgs;
    }

    /**
     * Get sweets price in roubles
     *
     * @return priceRub - price in roubles
     */
    public double getPriceRub() {
        return priceRub;
    }

    /**
     * Get the sweet's name.
     *
     * @return name - the sweet's name
     */
    public String getName() {
        return name;
    }
}
