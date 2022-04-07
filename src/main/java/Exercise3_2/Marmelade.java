package Exercise3_2;

public class Marmelade extends Sweet {

    private final String color;

    public Marmelade(String name, double weightKgs, double priceRub, String color){
        super(name, weightKgs, priceRub);
        this.color = color;
    }

    @Override
    public void printSweetInfo() {
        System.out.printf("Gift name: %s\nColor: %s\nGift price in russian roubles:" +
                " %.2f kg. rub.\nGift weight: %.2f\n\n", getName(), this.color, getPriceRub(), getWeightKgs());
    }
}
