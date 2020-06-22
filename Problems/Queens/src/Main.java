import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x1 = reader.nextInt();
        int y1 = reader.nextInt();
        int x2 = reader.nextInt();
        int y2 = reader.nextInt();

//toDo Failed test #4 of 14. Wrong answer
        if (Math.abs(x1) == Math.abs(x2) || Math.abs(y1) == Math.abs(y2)) {
            System.out.println("YES");
        } else if (Math.abs(x1) == Math.abs(y1) && Math.abs(x2) == Math.abs(y2)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}