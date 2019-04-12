package misc;

public class Calculator {

    public double number1;
    public double number2;
    public String operator;

    public boolean shouldReadSecondNumber() {
        return !operator.equals("!");
    }

    public double factorial(double n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public double calculate() {
        switch (operator) {
            case "!":
                return factorial(number1);
            case "+":
                return sum(number1, number2);
            case "-":
                return subtract(number1, number2);
            case "*":
                return multiply(number1, number2);
            case "/":
                return divide(number1, number2);
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }

    private double sum(double first, double second) {
        return first + second;
    }

    private double subtract(double first, double second) {
        return first - second;
    }

    private double multiply(double first, double second) {
        return first * second;
    }

    private double divide(double first, double second) {
        return first / second;
    }
}
