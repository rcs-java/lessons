import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you like cats, press C!");
        System.out.println("If you like dogs, press D!");

        String choice = sc.next();
        Pet pet;

        if (choice.equals("C")) {
            pet = new Cat();
        } else if (choice.equals("D")) {
            pet = new Dog();
        } else {
            System.out.println("We do not support such fancy pets!");
            return;
        }

        String message = pet.getVoiceMessage();
        System.out.println(message);
    }
}
