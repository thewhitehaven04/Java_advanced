package Exercise3_2;

/**
 * Models Marshmallow type sweets
 */
public class Marshmallow extends Sweet {

    private final String features;

    public Marshmallow(String name, double weightKgs, double priceRub, String features) {
        super(name, weightKgs, priceRub);
        this.features = features;
    }

    /**
     * Prints features of a given Marshmallow instance
     */
    @Override
    public void printSweetInfo() {
        System.out.printf("Gift name: %s\nUnique features: %s\nGift price in russian roubles:" +
                " %.2f kg. rub.\nGift weight: %.2f\n\n", getName(), this.features, getPriceRub(), getWeightKgs());
    }
}
