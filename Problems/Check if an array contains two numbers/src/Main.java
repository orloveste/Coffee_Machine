import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int length = reader.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = reader.nextInt();
        }
        int n = reader.nextInt();
        int m = reader.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == m) {
                count++;
                if (array[i++] == n || array[i--] == n) {
                    count++;
                }
            }
        }
        System.out.println(count == 2);
    }
}
//Failed test #3 of 5. Wrong answer
//7
//6 3 4 8 3 2 6
//8 2
// it is true

//Test 5 is:
//7
//6 3 4 8 3 2 6
//3 8

//Test 4
//7
//6 3 4 8 3 2 6
//8 3