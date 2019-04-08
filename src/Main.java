import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        calc.number1 = sc.nextDouble();
        calc.operator = sc.next();

        if (calc.shouldReadSecondNumber()) {
            calc.number2 = sc.nextDouble();
        }

        double res = calc.calculate();
        System.out.println(res);
    }
}
