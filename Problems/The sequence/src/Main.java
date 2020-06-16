import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int inputs = reader.nextInt();
        int maxElDivFour = 0;
        for (int i = 0; i < inputs; i++) {
            int checkNumbers = reader.nextInt();
            if (checkNumbers % 4 == 0 && checkNumbers > maxElDivFour) {
                maxElDivFour = checkNumbers;
            }
        }
        System.out.println(maxElDivFour);
    }
}