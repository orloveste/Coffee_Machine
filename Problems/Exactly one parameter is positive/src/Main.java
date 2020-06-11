import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() > 0) {
                count++;
            }
        }
        System.out.println(count == 1);
    }
}