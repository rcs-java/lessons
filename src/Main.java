import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userInput = 0;
        try {
            userInput = getUserInput();
        } catch (InputMismatchException whatever) {
            System.out.println(whatever.getMessage());
            return;
        }

        userInput++;
        System.out.println("Your input plus one is: " + userInput);
    }

    private static int getUserInput() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 1 to 10");

        int i = 0;
        try {
            i = sc.nextInt();
        } catch (InputMismatchException failRead) {
            throw new InputMismatchException("Please input a number!");
        }

        if (i < 1) {
            throw new InputMismatchException("Number too small");
        } else if (i > 10) {
            throw new InputMismatchException("Number too large");
        } else {
            return i;
        }
    }
}
