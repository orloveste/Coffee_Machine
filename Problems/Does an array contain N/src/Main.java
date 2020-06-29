
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int len = reader.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
//        System.out.println(Arrays.toString(arr));
        int numCheck =  reader.nextInt();
        boolean noCheck = false;
        for (int value : arr) {
            if (numCheck == value) {
                noCheck = true;
                break;
            }
        }
        System.out.println(noCheck);
    }
}
