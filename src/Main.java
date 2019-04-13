import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Login at 13:50

        // - if user exists, tell about failure
        // b) if they choose to log in
        // - ask for user name, password
        // - check if they match the file
        // - tell if login successful

        // hint: use file to store the credentials
        // extra task: handle multiple users
        // (can still be done with a single file)

        System.out.println("Do you want to log in (L) or register (R)?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
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
            // login
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void registerUser() throws IOException, RuntimeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your user name!");
        String username = sc.next();
        System.out.println("Please input your password!");
        String password = sc.next();
        System.out.println("Please confirm your password!");
        String confirmation = sc.next();

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
