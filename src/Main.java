import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toLowerCase();
        int letterCounts[] = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letter - 97;
            letterCounts[index]++;
        }

        for (int i = 0; i < 26; i++) {
            char letter = (char) (i + 97);
            System.out.println(letter + ": " + letterCounts[i]);
        }
    }
}
