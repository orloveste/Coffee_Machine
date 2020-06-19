package machine;

import java.util.Scanner;

public class CoffeeMachine {
    //Stage 4/6: Action!
    private static int disposableCup = 9;
    private static int moneyStock = 550;
    private static int milkStock = 540;
    private static int waterStock = 400;
    private static int coffeeBeansStock = 120;

    public static void espressoRecipe() { //Stage 4/6: Action!
        int waterRecipe = 250; // ml
        int milkRecipe = 0; // ml
        int coffeeBeansRecipe = 16; // g;
        int cost = 4;
        checkStock(waterRecipe, milkRecipe, coffeeBeansRecipe, cost);
    }
    public static void latteRecipe() { //Stage 4/6: Action!
        int waterRecipe = 350; // ml
        int milkRecipe = 75; // ml
        int coffeeBeansRecipe = 20; // g;
        int cost = 7;
        checkStock(waterRecipe, milkRecipe, coffeeBeansRecipe, cost);
    }
    public static void cappuccinoRecipe() { //Stage 4/6: Action!
        int waterRecipe = 200; // ml
        int milkRecipe = 100; // ml
        int coffeeBeansRecipe = 12; // g
        int cost = 6;
        checkStock(waterRecipe, milkRecipe, coffeeBeansRecipe, cost);
    }
    private static void checkStock(int waterRecipe, int milkRecipe, int coffeeBeansRecipe, int cost) {
        if (waterStock >= waterRecipe && milkStock >= milkRecipe && /*Stage #5: On a coffee loop*/
                coffeeBeansStock >= coffeeBeansRecipe && disposableCup > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            CoffeeMachine.waterStock -= waterRecipe;
            CoffeeMachine.milkStock -= milkRecipe;
            CoffeeMachine.coffeeBeansStock -= coffeeBeansRecipe;
            CoffeeMachine.disposableCup--;
            CoffeeMachine.moneyStock += cost;
        } else if (waterRecipe > waterStock) {
            System.out.println("Sorry, not enough water!");
        } else if (milkRecipe > milkStock) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeansRecipe > coffeeBeansStock) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disposableCup == 0) {
            System.out.println("Sorry, not enough cup's!");
        }
    }
    public static void buy() { //Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        System.out.print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n> ");
        String readChooseCoffee =  reader.next();
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

        System.out.print("Write how many disposable cups do you want to add:\n> ");
        int addDisposableCups = reader.nextInt();
        CoffeeMachine.disposableCup += addDisposableCups;
    }
    public static void take() { //Stage 4/6: Action!
        int moneyFromCoffeeMachine = moneyStock;
        moneyStock -= moneyFromCoffeeMachine;
        System.out.println("I gave you $" + moneyFromCoffeeMachine);
    }
    public static void hello() { //Work on project. Stage 4/6: Action!
        System.out.println("\nThe coffee machine has:\n" +
                waterStock + " of water\n" +
                milkStock + " of milk\n" +
                coffeeBeansStock + " of coffee beans\n" +
                disposableCup + " of disposable cups\n" +
                moneyStock + " of money");
    }
    private static void command() { //Work on project. Stage 4/6: Action!
        Scanner reader = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take, remaining, exit):\n> ");
        String input = reader.next();

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
                hello();
                break;
            case "exit" :
                break;

        }

    }

    public static void main(String[] args) {
        //Stage #5: On a coffee loop
        command();

    }
}

// Exception in test #7  Probably your program run out of input (Scanner tried to read 
// more than expected).  java.util.NoSuchElementException at 
// java.base/java.util.Scanner.throwFor(Scanner.java:937) at 
// java.base/java.util.Scanner.next(Scanner.java:1478) at 
// machine.CoffeeMachine.command(CoffeeMachine.java:144) at 
// machine.CoffeeMachine.main(CoffeeMachine.java:151)  Please find below the output...
//Start test 7
//Write action (buy, fill, take, remaining, exit):
//> > remaining
//
//The coffee machine has:
//400 of water
//540 of milk
//120 of coffee beans
//9 of disposable cups
//550 of money
//
//Write action (buy, fill, take, remaining, exit):
//> > buy
//
//What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
//> > back
//Write action (buy, fill, take, remaining, exit):
//> > remaining
//
//The coffee machine has:
//400 of water
//540 of milk
//120 of coffee beans
//9 of disposable cups
//550 of money
//
//Write action (buy, fill, take, remaining, exit):
//> > exit
//
//Write action (buy, fill, take, remaining, exit):
//>

//Wrong answer in test #7
// There should be two lines with "milk", found: 3  Please find below the 
// output of your program during this failed test. Note that the '>' character indicates the 
// beginning of the input line.  ---  Write action (buy, fill, take, remaining, exit):
// > > remaining
// The coffee machine has: 400 of water 540 of milk 120 of coffee beans 9 of disposable cup...

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