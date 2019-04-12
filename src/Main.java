import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] userInput = new int[5];

        for (int i = 0; i < 5; i++) {
            userInput[i] = sc.nextInt();
        }

        for (int inp : userInput) {
            System.out.println(inp);
        }
    }
}
