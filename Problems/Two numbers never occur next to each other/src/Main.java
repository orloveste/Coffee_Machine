import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sizeArray = reader.nextInt();
        int [] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = reader.nextInt();
        }
        int n = reader.nextInt();
        int m = reader.nextInt();
        boolean neverOccur = true;

        //v4
        for (int i = 0; i < sizeArray; i++) {
           if (n == array[i]) {
             if (m == array[i - 1]) {
                 neverOccur = false;
                 break;
             }
            }
           else if (m == array[i]) {
               if (n == array[i - 1] || n == array[i + 1]) {
                   neverOccur = false;
                   break;
               }
           }
        }
        System.out.println(neverOccur);
    }
}

//Failed test #6 of 8. Runtime error  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
// Index 10 out of bounds for length 10 at Main.main(Main.java:24)
/* //v3
        if (n != m) {
            if (n == m - 1 || n == m + 1) {

            }
        }*/
        /*//v2
        for (int i = 0; i < sizeArray; i++) {
            if (n == m - 1 || n == m + 1 && array[i] == n || array[i] == m) {

                neverOccur = false;

            }*/

            /*// v1
            if (array[i] == n) {
                if (i != 0) {
                    if (m != array[i - 1]) {
                        neverOccur = true;
                    }
                } else if (i != sizeArray - 1) {
                    if (m != array[i + 1]) {
                        neverOccur = true;
                    }
                }
            } else if (array[i] == m) {
                if (i != 0) {
                    if (n != array[i - 1]) {
                        neverOccur = true;
                    }
                } else if (i != sizeArray - 1) {
                    if (n != array[i + 1]) {
                        neverOccur = true;
                    }
                }
            }*/