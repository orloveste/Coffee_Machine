package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int disposableCup = 0;

    public static void espresso() {
        int waterRecipe = 250; // ml
        int milkRecipe = 0; // ml
        int coffeeBeansRecipe = 16; // g;
        int cost = 4;
    }
    public static void latte() {
        int waterRecipe = 350; // ml
        int milkRecipe = 75; // ml
        int coffeeBeansRecipe = 20; // g;
        int cost = 7;
    }
    public static void cappuccino() {
        int waterRecipe = 200; // ml
        int milkRecipe = 100; // ml
        int coffeeBeansRecipe = 12; // g
        int cost = 6;
    }
    public static int disposableCup() {
        return disposableCup++;
    }

    public static void refill(){
    }

    public static void takeMoney(){
    }

    /*public static int amountOfCoffeeFromInventory(int waterInventory, int milkInventory,
                                                      int coffeeInventory) {
        //stage 3/6
        int waterRecipe = 200; // ml
        int milkRecipe = 50; // ml
        int coffeeBeansRecipe = 15; // g

        int w = waterInventory / waterRecipe;
        int m = milkInventory / milkRecipe;
        int c = coffeeInventory / coffeeBeansRecipe;

        int min = Math.min(w, m);
        return Math.min(min, c);
    }*/

    public static void main(String[] args) {
        //Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        String buy;
        String fill;
        String take;


        System.out.println("Enter Command:  \"buy\", \"fill\", \"take\"");
        String input = reader.nextLine();
        switch (input) {
            case "buy" :
                System.out.println("buy - choose: espresso ->(press 1), latte ->(press 2), or cappuccino ->(press 3).");
                int readChooseCoffe =  reader.nextInt();
                if (readChooseCoffe == 1) {
                    espresso();
                    System.out.println("execute espresso");
                } else if (readChooseCoffe == 2) {
                    latte();
                    System.out.println("execute latte");
                } else if (readChooseCoffe == 3) {
                    cappuccino();
                    System.out.println("execute cappuccino");
                }

                break;
            case "fill" :
                System.out.println("fill");
                break;
            case "take" :
                System.out.println("take");
                break;
            default:
                System.out.println("not accepted command");
        }




    }
}

 /*
 //stage 3/6 runner

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
        }*/