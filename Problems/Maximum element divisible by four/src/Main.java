import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        int maxElSeqDivFour = 0;
        for (int i = 0; i < input; i++) {
            int checkNum = reader.nextInt();
            if (checkNum % 4 == 0 && checkNum > maxElSeqDivFour) {
                maxElSeqDivFour = checkNum;
            }
        }
        System.out.println(maxElSeqDivFour);
    }
}