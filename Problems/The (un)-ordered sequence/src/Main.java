import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();
        int checkNum = reader.nextInt();
        boolean pass = false;

        if (num <= checkNum) {
            pass = isPass(reader, checkNum, pass);
        }
        else if (num >= checkNum) {
            pass = isPass(reader, checkNum, pass);
        }
        System.out.println(pass);



        /*Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        int [] array = new int[input];
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1] ) {
                counter++;
            } else if (array[i] <= array[i - 1] ) {
                counter++;
            }
        }
        System.out.println(counter == array.length - 1);*/
    }

    private static boolean isPass(Scanner reader, int checkNum, boolean pass) {
        int num;
        num = checkNum;
        do {
            checkNum = reader.nextInt();
            if (checkNum == ' ') {
                break;
            } else if (checkNum >= num) {
                pass = true;
                num = checkNum;
            }
        } while (pass == true);
        return pass;
    }
}

//Failed test #3 of 11. Wrong answer  This is a sample test from the problem statement!
// Test input: 1 2 5 5 2 3 0
// Correct output: false
// Your code output: true