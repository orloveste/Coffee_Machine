package machine;

import java.util.Scanner;

public class CoffeeMachine {
    //Stage 4/6: Action!
    private static int disposableCup = 9; // piece
    private static int moneyStock = 550; // $
    private static int milkStock = 540; // ml
    private static int waterStock = 400; // ml
    private static int coffeeBeansStock = 120; // g

    public static void espressoRecipe() { //Stage 4/6: Action!
        int waterRecipe = 250; // ml
        int milkRecipe = 0; // ml
        int coffeeBeansRecipe = 16; // g;
        int cost = 4; // $

        CoffeeMachine.waterStock = waterStock - waterRecipe;
        CoffeeMachine.coffeeBeansStock = coffeeBeansStock - coffeeBeansRecipe;
        CoffeeMachine.disposableCup--;
        CoffeeMachine.moneyStock = moneyStock + cost;
    }
    public static void latteRecipe() { //Stage 4/6: Action!
        int waterRecipe = 350; // ml
        int milkRecipe = 75; // ml
        int coffeeBeansRecipe = 20; // g;
        int cost = 7; // $

        CoffeeMachine.waterStock = waterStock - waterRecipe;
        CoffeeMachine.milkStock = milkStock - milkRecipe;
        CoffeeMachine.coffeeBeansStock = coffeeBeansStock - coffeeBeansRecipe;
        CoffeeMachine.disposableCup--;
        CoffeeMachine.moneyStock = moneyStock + cost;
    }
    public static void cappuccinoRecipe() { //Stage 4/6: Action!
        int waterRecipe = 200; // ml
        int milkRecipe = 100; // ml
        int coffeeBeansRecipe = 12; // g
        int cost = 6;

        CoffeeMachine.waterStock = waterStock - waterRecipe;
        CoffeeMachine.milkStock = milkStock - milkRecipe;
        CoffeeMachine.coffeeBeansStock = coffeeBeansStock - coffeeBeansRecipe;
        CoffeeMachine.disposableCup--;
        CoffeeMachine.moneyStock = moneyStock + cost;
    }
    public static void buy() { //Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:\n> ");
        String readChooseCoffee = reader.nextLine();
        switch (readChooseCoffee) {
            case "1":
                espressoRecipe();
                break;
            case "2":
                latteRecipe();
                break;
            case "3":
                cappuccinoRecipe();
                break;
            case "back":
                command();
                break;
        }
    }
    public static void fill(){ //Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        System.out.print("Write how many ml of water do you want to add:\n> ");
        int addWater = reader.nextInt();
        CoffeeMachine.waterStock += addWater;

        System.out.print("Write how many ml of milk do you want to add:\n> ");
        int addMilk = reader.nextInt();
        CoffeeMachine.milkStock += addMilk;

        System.out.print("Write how many grams of coffee beans do you want to add:\n> ");
        int addCoffee = reader.nextInt();
        CoffeeMachine.coffeeBeansStock += addCoffee;

        System.out.print("how many disposable cups do you want to add:\n> ");
        int addDisposableCups = reader.nextInt();
        CoffeeMachine.disposableCup += addDisposableCups;
    }
    public static void take() { //Stage 4/6: Action!
        int moneyFromCoffeeMachine = moneyStock;
        moneyStock -= moneyFromCoffeeMachine;
        System.out.println("I gave you $" + moneyFromCoffeeMachine);
    }
    public static void remainingStock() { //Work on project. Stage 4/6: Action!
        System.out.println("The coffee machine has:\n" +
                waterStock + " of water\n" +
                milkStock + " of milk\n" +
                coffeeBeansStock + " of coffee beans\n" +
                disposableCup + " of disposable cups\n" +
                moneyStock + " of money\n");
    }
    private static void command() { //Work on project. Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take, remaining, exit):\n> ");
        String input = reader.next();
        while (!input.toLowerCase().equals("exit")) {
            switch (input) {
                case "buy" :
                    buy();
                    break;
                case "fill" :
                    fill();
                    break;
                case "take" :
                    take();
                    break;
                case "remaining" :
                    remainingStock();
                    break;
                case "exit" :
                    break;
                default:
                    System.out.print("Write action (buy, fill, take, remaining, exit):\n> ");
                    reader.next();
            }
            System.out.print("Write action (buy, fill, take, remaining, exit):\n> ");
            input = reader.next();
        }

    }
    public static void goodBye() { //Work on project. Stage 4/6: Action!
        System.out.println("\nThe coffee machine has:\n" +
                waterStock + " of water\n" +
                milkStock + " of milk\n" +
                coffeeBeansStock + " of coffee beans\n" +
                disposableCup + " of disposable cups\n" +
                moneyStock + " of money\n");
    }

    public static void main(String[] args) {
        //Work on project. Stage 5/6: On a coffee loop
        command();
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