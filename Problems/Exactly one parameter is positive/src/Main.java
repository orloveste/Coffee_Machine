import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //-1;
        int b = scanner.nextInt(); //-1;
        int c = scanner.nextInt(); //1;

        if (a > 0 && b <= 0 && c <= 0) {
            System.out.println(true);
        } else if (a <= 0 && b > 0 && c <= 0) {
            System.out.println(true);
        } else if (a <= 0 && b <= 0 && c > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}