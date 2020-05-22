import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reder = new Scanner(System.in);
        int numberOfEntries = reder.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < numberOfEntries; i++) {
            int entryCheck = reder.nextInt();
            if (entryCheck == 5) {
                a++;
            } else if (entryCheck == 4) {
                b++;
            } else if (entryCheck == 3) {
                c++;
            } else if (entryCheck == 2) {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
