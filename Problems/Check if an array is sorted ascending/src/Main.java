import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arrLength = reader.nextInt();
        int[] array = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            array[i] = reader.nextInt();
        }
        int count = 0;
        for (int i = 1; i < arrLength; i++) {
            if (array[i] > array[i - 1]) {
                count++;
            }
        }
        System.out.println(count == arrLength - 1);
    }
}