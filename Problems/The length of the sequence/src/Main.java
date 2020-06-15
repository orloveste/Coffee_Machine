import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        while (reader.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}