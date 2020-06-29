import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int len = 10; //reader.nextInt();
        int[] array = {1, 2, 4, 1, 2, 3, 5, 7, 4, 3}; //new int[len];
//        for (int i = 0; i < len; i++) {
//            array[i] = reader.nextInt();
//        }

        int count = 1;
        int [] countArr = new int[len];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i++]) {
                count++;
            }
        }
        System.out.println(Arrays.toString(countArr));
    }
}