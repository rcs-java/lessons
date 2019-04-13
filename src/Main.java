import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scField;

    public static void main(String[] args)
    {
        // - if user exists, tell about failure
        // b) if they choose to log in
        // - ask for user name, password
        // - check if they match the file
        // - tell if login successful

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
            login();
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void login() {
        System.out.println("Please input your user name!");
        String username = scField.next();
        System.out.println("Please input your password!");
        String password = scField.next();


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

        File f = new File("userData.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(username);
        fw.write(System.lineSeparator());
        fw.write(password);
        fw.flush();
    }
}
