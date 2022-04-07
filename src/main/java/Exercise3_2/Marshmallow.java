package Exercise3_2;

public class Marshmallow extends Sweet {

    private final String features;

    public Marshmallow(String name, double weightKgs, double priceRub, String features) {
        super(name, weightKgs, priceRub);
        this.features = features;
    }

    @Override
    public void printSweetInfo() {
        System.out.printf("Gift name: %s\nUnique features: %s\nGift price in russian roubles:" +
                " %.2f kg. rub.\nGift weight: %.2f\n\n", getName(), this.features, getPriceRub(), getWeightKgs());
    }
}
