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
        double result;
        switch (operator) {
            case "!":
                result = factorial(number1);
                break;
            case "+":
                result = sum(number1, number2);
                break;
            case "-":
                result = subtract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                result = divide(number1, number2);
                break;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }

        return result;
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
