import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> hotDrinks;

    public HotDrinkVendingMachine() {
        hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrinkWithTemperature("Coffee", 200, 70));
        hotDrinks.add(new HotDrinkWithTemperature("Tea", 150, 80));
        hotDrinks.add(new HotDrinkWithTemperature("Cocoa", 250, 60));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
}


