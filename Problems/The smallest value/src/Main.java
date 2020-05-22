import java.util.Scanner;

class Main {
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long m = reader.nextLong();
        long n = 0;
        do {
            n++;
        } while (factorial(n) <= m);
        System.out.println(n);
    }
}