package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /*need for one cup of coffe*/
        int water = 200; // ml
        int milk = 50; // ml
        int coffeBeans = 15; // g

        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCoffee = reader.nextInt();


        System.out.println("For " + amountOfCoffee + " cups of coffee you will need:\n" +
                amountOfCoffee * water + " ml of water\n" +
                amountOfCoffee * milk + " ml of milk\n" +
                amountOfCoffee * coffeBeans + " g of coffee beans");
    }
}
