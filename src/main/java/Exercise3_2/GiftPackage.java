package Exercise3_2;
/**2. Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */


/**
 * Contains collection of all gifts.
 */
public class GiftPackage {
    private final Sweet[] collection;

    public GiftPackage(Sweet... gifts) {
        this.collection = gifts;
    }

    /**
     * Prints gift details for each gift.
     */
    public void printGiftInfo() {
        for (Sweet gift : collection) {
            gift.printSweetInfo();
        }
    }

    public void printPackagePrice() {
        double total = 0;
        for (Sweet gift : collection) {
            total += gift.getPriceRub();
        }
        System.out.printf("Total price: %.2f rub.\n", total);
    }

    public void printTotalWeight() {
        double total = 0;
        for (Sweet gift : collection) {
            total += gift.getWeightKgs();
        }
        System.out.printf("Total weight: %.2f kg\n", total);
    }

    public static void main(String[] args) {
        // initializing gifts
        Sweet toblerone = new Chocolate("Toblerone", 0.1, 241.00, ChocolateType.WHITE);
        Sweet babaevsky = new Chocolate("Babaevsky Hazelnut", 0.1, 118.50, ChocolateType.BLACK);
        Sweet ms = new Marshmallow("Шармэль", 0.255, 152.00, "Яблочный");
        Sweet palmaFoods = new Marmelade("Palma Foods", 0.5, 299.00, "Yellow");

        GiftPackage gift = new GiftPackage(toblerone, babaevsky, ms, palmaFoods);
        gift.printTotalWeight();
        gift.printPackagePrice();
        gift.printGiftInfo();
    }
}
