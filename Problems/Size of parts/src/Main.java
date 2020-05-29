import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberOfImputs = reader.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 0; i < numberOfImputs; i++) {
            int standard = reader.nextInt();
            if (standard == 1) {
                larger++;
            } else if (standard == -1) {
                smaller++;
            } else if (standard == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}