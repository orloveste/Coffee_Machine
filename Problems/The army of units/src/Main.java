import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // The army of units
        Scanner reader = new Scanner(System.in);
        int checkNumber = reader.nextInt();
        if (checkNumber < 1) {
            System.out.println("no army");
        } else if (checkNumber < 20) {
            System.out.println("pack");
        } else if (checkNumber < 250) {
            System.out.println("throng");
        } else if (checkNumber < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
