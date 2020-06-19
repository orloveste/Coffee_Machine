import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long firstNumber = reader.nextLong();
        String operator = reader.next();
        long secondNumber = reader.nextLong();

        switch (operator) {
            case "+" :
                System.out.println(firstNumber + secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber - secondNumber);
                break;
            case "/" :
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case "*" :
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}