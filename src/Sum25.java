public class Sum25 {
    public static void main(String args[]) {
        nextDigit("1", 1, 2);
    }

    public static void nextDigit(String soFar, int currentResult, int nextDigit) {
        if (nextDigit > 9) {
            if (currentResult == 25) System.out.println(soFar + "=" + currentResult);
            else return;
        } else {
            nextDigit(soFar + "+" + nextDigit, currentResult + nextDigit, nextDigit + 1);
            nextDigit(soFar + "-" + nextDigit, currentResult - nextDigit, nextDigit + 1);
        }
    }
}
