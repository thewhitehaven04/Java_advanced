package Exercise3_2;



public class Chocolate extends Sweet {

    private ChocolateType chocolateType;

    public Chocolate(String name, double weightKgs, double priceRub, ChocolateType chocolateType){
        super(name, weightKgs, priceRub);
        this.chocolateType = chocolateType;
    }

    public Chocolate(String name, double weightKgs, double priceRub) {
        super(name, weightKgs, priceRub);
    }

    @Override
    public void printSweetInfo() {
        System.out.printf("Gift name: %s\nChocolate type: %s\nGift price in russian roubles:" +
                " %.2f kg. rub.\nGift weight: %.2f\n\n", getName(), this.chocolateType, getPriceRub(), getWeightKgs());
    }
}
