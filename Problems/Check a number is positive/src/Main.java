import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Check a number is positive
        Scanner reader = new Scanner(System.in);

        System.out.println(reader.nextInt() > 0 ? "YES" : "NO");
    }
}