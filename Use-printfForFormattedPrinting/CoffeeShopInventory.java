public class CoffeeShopInventory {
  public static void main(String args[]) {
   String shopName = "Java Beans";
   String brand = "Tim";
   char size = 'V';
        int coffeeTypes = 5;
        double averagePrice = 3.99;
        boolean isOpen = true;
        //%s placeholder for any String; %d for int; %c for Char; %b for Boolean; %.2f for Float with 2 precision after decimal
        System.out.printf("Shop: %s\nBrand: %s\nCup Size:%c\nCoffee Types: %d\nAverage Price: $%.2f\nOpen: %b\n", shopName, brand, size, coffeeTypes, averagePrice, isOpen);
    }
}
