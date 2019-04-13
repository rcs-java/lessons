import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scField;
    private static String fileName = "userData.txt";

    public static void main(String[] args)
    {
        // - if user exists, tell about failure

        // hint: use file to store the credentials
        // extra task: handle multiple users
        // (can still be done with a single file)

        System.out.println("Do you want to log in (L) or register (R)?");
        scField = new Scanner(System.in);
        String choice = scField.next();
        if (choice.equals("R")) {
            try {
                registerUser();
                System.out.println("Registered successfully!");
            } catch (IOException ex) {
                System.out.println("File error: " + ex.getMessage());
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (choice.equals("L")) {
            try {
                if (login()) {
                    System.out.println("Logged in successfully!");
                } else {
                    System.out.println("Incorrect username/password!");
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Please register before logging in!");
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static boolean login() throws FileNotFoundException {
        System.out.println("Please input your user name!");
        String username = scField.next();
        System.out.println("Please input your password!");
        String password = scField.next();

        File f = new File(fileName);
        Scanner fileScan = new Scanner(f);
        String existingUsername = fileScan.nextLine();
        String existingPass = fileScan.nextLine();

        if (username.equals(existingUsername)
            && existingPass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    private static void registerUser() throws IOException, RuntimeException {
        System.out.println("Please input your user name!");
        String username = scField.next();
        System.out.println("Please input your password!");
        String password = scField.next();
        System.out.println("Please confirm your password!");
        String confirmation = scField.next();

        if (!password.equals(confirmation)) {
            throw new RuntimeException("The passwords do not match!");
        }

        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        fw.write(username);
        fw.write(System.lineSeparator());
        fw.write(password);
        fw.flush();
    }
}
