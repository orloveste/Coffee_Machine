import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Shape
        Scanner reader = new Scanner(System.in);
        switch (reader.nextInt()) {
            case 1 :
                System.out.println("You have chosen a square");
                break;
            case 2 :
                System.out.println("You have chosen a circle");
                break;
            case 3 :
                System.out.println("You have chosen a triangle");
                break;
            case 4 :
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
        }
    }
}