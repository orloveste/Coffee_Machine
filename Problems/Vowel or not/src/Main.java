import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == ch) {
                isVowel = true;
            }
        }
        return isVowel;
        /*String vowels = "aeiouAEIOU";
        return vowels.indexOf(ch) != -1;*/
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().toLowerCase().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}