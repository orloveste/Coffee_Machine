package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int amountOfCoffeeFromInventory(int waterInventory, int milkInventory,
                                                      int coffeeInventory) {
        int waterRecipe = 200; // ml
        int milkRecipe = 50; // ml
        int coffeeBeansRecipe = 15; // g

        int w = waterInventory / waterRecipe;
        int m = milkInventory / milkRecipe;
        int c = coffeeInventory / coffeeBeansRecipe;

        int min = Math.min(w, m);
        return Math.min(min, c);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInventory = reader.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInventory = reader.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeInventory = reader.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCoffee = reader.nextInt();
        int minimumAmountOfCoffee = amountOfCoffeeFromInventory(waterInventory, milkInventory, coffeeInventory);

        if (amountOfCoffee == minimumAmountOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (amountOfCoffee > minimumAmountOfCoffee) {
            System.out.println("No, I can make only " + minimumAmountOfCoffee + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (minimumAmountOfCoffee - amountOfCoffee) + " more than that)");
        }
    }
}
