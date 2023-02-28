public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса HotDrink и HotDrinkWithTemperature
        HotDrink coffee = new HotDrinkWithTemperature("Coffee", 200, 70);
        HotDrink tea = new HotDrinkWithTemperature("Tea", 150, 80);
        HotDrink cocoa = new HotDrinkWithTemperature("Cocoa", 250, 60);

        // Создаем объект класса HotDrinkVendingMachine
        VendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Получаем напиток из автомата с помощью метода getProduct
        HotDrink hotDrink1 = vendingMachine.getProduct("Coffee", 200, 70);
        HotDrink hotDrink2 = vendingMachine.getProduct("Tea", 150, 80);
        HotDrink hotDrink3 = vendingMachine.getProduct("Cocoa", 250, 60);

        // Выводим информацию о каждом полученном напитке
        System.out.println(hotDrink1 != null ? hotDrink1.getName() + " - " + hotDrink1.getVolume() + " ml - " + hotDrink1.getTemperature() + " C" : "Product not found");
        System.out.println(hotDrink2 != null ? hotDrink2.getName() + " - " + hotDrink2.getVolume() + " ml - " + hotDrink2.getTemperature() + " C" : "Product not found");
        System.out.println(hotDrink3 != null ? hotDrink3.getName() + " - " + hotDrink3.getVolume() + " ml - " + hotDrink3.getTemperature() + " C" : "Product not found");

        // Получаем несуществующий напиток
        HotDrink hotDrink4 = vendingMachine.getProduct("Tea", 200, 70);
        System.out.println(hotDrink4 != null ? hotDrink4.getName() + " - " + hotDrink4.getVolume() + " ml - " + hotDrink4.getTemperature() + " C" : "Product not found");

    }
}

